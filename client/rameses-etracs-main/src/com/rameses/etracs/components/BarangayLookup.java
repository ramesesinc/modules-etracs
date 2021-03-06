/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.etracs.components;

import com.rameses.common.PropertyResolver;
import com.rameses.rcp.control.XComponentPanel;
import com.rameses.rcp.ui.annotations.ComponentBean;
import java.beans.Beans;

/**
 *
 * @author dell
 */
@ComponentBean("com.rameses.etracs.components.BarangayLookupModel")
public class BarangayLookup extends XComponentPanel {

    private String onselect; 
    private String onempty;
    
    
    /**
     * Creates new form BarangayLookup
     */
    public BarangayLookup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        component = new com.rameses.rcp.control.XLookupField();

        setLayout(new java.awt.BorderLayout());

        component.setCaption("Barangay");
        component.setCaptionWidth(120);
        component.setExpression("#{value.name}");
        component.setHandler("barangay:lookup");
        component.setName("value"); // NOI18N
        component.setPreferredSize(new java.awt.Dimension(0, 22));
        add(component, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XLookupField component;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void setName(String name) {
        super.setName(name);
        if(Beans.isDesignTime()) {
            System.out.println("set name in component " + name);
            component.setText(name);
        }
    }
    
    public String getOnselect() { return onselect; } 
    public void setOnselect( String onselect ) {
        this.onselect = onselect; 
    }
    
    public String getOnempty() { return onempty; } 
    public void setOnempty( String onempty ) {
        this.onempty = onempty; 
    } 
    
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        component.setEnabled(enabled);
    }

    @Override
    public void afterLoad() {
        super.afterLoad();
        Object caller = getBean();
        Object bean = getComponentBean(); 
        PropertyResolver pr = PropertyResolver.getInstance();
        if ( getOnselect() != null ) {
            Object handler = pr.getProperty(caller, getOnselect()); 
            pr.setProperty(bean, "onselect", handler);
        }
        if ( getOnempty() != null ) {
            Object handler = pr.getProperty(caller, getOnempty()); 
            pr.setProperty(bean, "onempty", handler);
        }
    }
    
}
