/*
 * NewPatientPage.java
 *
 * Created on March 29, 2014, 11:15 AM
 */

package com.rameses.etracs.common;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  Elmo
 */
@StyleSheet
public class LocalAddressPage extends javax.swing.JPanel {
    
    /** Creates new form NewPatientPage */
    public LocalAddressPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        barangayLookup1 = new com.rameses.etracs.components.BarangayLookup();
        xTextField6 = new com.rameses.rcp.control.XTextField();

        xFormPanel1.setCaption("Address");
        xFormPanel1.setCaptionWidth(100);

        xTextField4.setCaption("Unit No");
        xTextField4.setCaptionWidth(120);
        xTextField4.setName("entity.unitno"); // NOI18N
        xTextField4.setPreferredSize(new java.awt.Dimension(100, 22));
        xFormPanel1.add(xTextField4);

        xTextField1.setCaption("House / Bldg No");
        xTextField1.setCaptionWidth(120);
        xTextField1.setName("entity.bldgno"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(100, 22));
        xFormPanel1.add(xTextField1);

        xTextField3.setCaption("Bldg Name");
        xTextField3.setCaptionWidth(120);
        xTextField3.setName("entity.bldgname"); // NOI18N
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 22));
        xFormPanel1.add(xTextField3);

        xTextField2.setCaption("Street");
        xTextField2.setCaptionWidth(120);
        xTextField2.setName("entity.street"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 22));
        xFormPanel1.add(xTextField2);

        xTextField5.setCaption("Subdivision");
        xTextField5.setCaptionWidth(120);
        xTextField5.setName("entity.subdivision"); // NOI18N
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 22));
        xFormPanel1.add(xTextField5);

        barangayLookup1.setCaption("Barangay");
        barangayLookup1.setCaptionWidth(120);
        barangayLookup1.setName("entity.barangay"); // NOI18N
        barangayLookup1.setRequired(true);
        xFormPanel1.add(barangayLookup1);

        xTextField6.setCaption("PIN");
        xTextField6.setCaptionWidth(120);
        xTextField6.setName("entity.pin"); // NOI18N
        xTextField6.setPreferredSize(new java.awt.Dimension(0, 22));
        xFormPanel1.add(xTextField6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.etracs.components.BarangayLookup barangayLookup1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    // End of variables declaration//GEN-END:variables
    
}
