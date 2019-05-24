package com.rameses.gov.etracs.vehicle.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.common.*;
import com.rameses.util.*;

class  VehicleCashReceiptModel extends com.rameses.enterprise.treasury.cashreceipt.AbstractCashReceipt {
    
    @Invoker 
    def invoker;
    
    @Controller
    def workunit;
    
    def prefix;
    def status;   
    def txnid;
    def selectedItem;
    
    def query = [:];
    def billAmount = 0;
    def billItemList = [];
    
    boolean amountSpecified = false;
    def page = 'default';
    
    void init() {
        super.init();
        service = InvokerProxy.instance.create("CashReceiptService", null, null );
    }
    
    def doClose() {
        return '_close'; 
    }

    public String getConnection() {
        return invoker.module.properties.connection;
    }
    
    /*
    def _cashRctSvc;
    public def getService() {
        MsgBox.alert('getting cashreceipt service');
        if(!_cashRctSvc) {
            _cashRctSvc = InvokerProxy.instance.create("CashReceiptService", null, null );
        }
        return _cashRctSvc; 
    }*/
    
    def _billsvc;
    public def getBillingSvc() {
        if(!_billsvc) {
            _billsvc = InvokerProxy.instance.create("BillingCashReceiptService", null, getConnection() );
        }
        return _billsvc;
    }
    
    public String getRulename() {
        String s = invoker.properties.rulename;
        if( s != null ) { return s; }
        
        s = workunit?.info?.workunit_properties?.rulename;
        if( s != null ) return s;
    }

    public boolean getAllowDeposit() {
        return true;
    }
    
    def backToDefault() {
        page = 'default'; 
        return page;
    }
    
    def findTxn() {
        if(txnid.contains(":")) txnid = txnid.split(":")[1];
        def outcome = loadInfo([id:txnid, action:'open']);
        page = ( outcome == null ? 'default' : outcome);
        return page; 
    }
    
    def loadInfo(def p) {
        p.collectiontype = entity.collectiontype;
        p.billdate = entity.receiptdate;
        
        //must replace the action so it will reflect the action passed;
        query.action = p.action;
        p.putAll( query );
        def pp = [ rulename: getRulename(), params: p ]; 
        def info = null;
        try {
            info = billingSvc.getInfo( pp );
        }
        catch(serverErr) {
            if ( p.action == "barcode" ) return '_close';
            
            //log the errors starting from here 
            new RuntimeException( serverErr ).printStackTrace(); 
            //throw the actual error
            throw serverErr; 
        } 
        
        def warning = info?._warning; 
        if ( warning instanceof com.rameses.util.Warning ) {
            MsgBox.warn( warning.message ); 
        } 
        
        if( !info.billitems ) {
            if( getAllowDeposit() ) {
                if ( !MsgBox.confirm('There are no bill items found. Do you want to pay in advance?')) 
                    throw new BreakException(); 
                    
                def amt = MsgBox.prompt("Enter amount for advance payment. ");
                if(!amt) throw new BreakException();
                pp.params.amtpaid = new BigDecimal(""+amt);
                info = billingSvc.getInfo( pp );
            }
            else {
                throw new Exception("No bill items found");
            }
        }
        entity.putAll(info);
        billItemList = info.items;
        reloadItems(); 
        return "entry";
    }
    
    void reloadItems() {
        entity.items = [];
        entity.items.addAll( billItemList );
        itemListModel.reload();
        if(binding) binding.refresh();
        updateBalances();
    }
    
    public void updateBalances() {
        billAmount = NumberUtil.round( billItemList.sum{ it.amount } );
        super.updateBalances();
    }

    def itemListModel = [
        fetchList: { o->
            return entity.billitems;
        }
    ] as BasicListModel;

    
    def getTotalAmount() {
        return NumberUtil.round( entity.items.sum{ it.amount } );  
    }   
    
    def _payOption = null;
    public String getPayOption() {
        if(_payOption == null ) {
            _payOption = invoker.properties.payOption;
            if(!_payOption ) _payOption = workunit?.info?.workunit_properties?.payOption;
        } 
        return _payOption; 
    }
    
    def showPayOptions() {
        if( amountSpecified ) 
            throw new Exception("Please reset amount specified first to Pay All");
        if( !getPayOption() ) return null;
        def m = [:];
        m.onselect = { o->
            loadInfo( [id: txnid, action:'payoption', payoption: o ] );
        }
        return Inv.lookupOpener( getPayOption(), m);
    }
    
    void specifyPayAmount() {
        def o = MsgBox.prompt("Enter Pay Amount");
        if(!o) return null;
        def p = [amtpaid: o, id:txnid, action:'open' ];
        loadInfo( p );
        amountSpecified = true;
    }
    
    void payAll() {
        def p = [id:txnid, action:'open' ];
        loadInfo( p );
        amountSpecified = false;
    }
    
    def resetPayOption() {
        loadInfo( [id: txnid] );
    }
    
}