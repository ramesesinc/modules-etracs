/*
 * RemoteServerExportDataPage.java
 *
 * Created on November 7, 2013, 11:15 AM
 */

package com.rameses.gov.etracs.tools.exporter;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  Rameses
 */
@Template(FormPage.class)
public class RemoteServerDataInitPage extends javax.swing.JPanel {
    
    /** Creates new form RemoteServerExportDataPage */
    public RemoteServerDataInitPage() {
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
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();

        xFormPanel1.setName("entity.name"); // NOI18N
        xFormPanel1.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);

        xTextField1.setCaption("Remote Name");
        xTextField1.setName("entity.objid"); // NOI18N
        xTextField1.setCaptionWidth(120);
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField1.setRequired(true);
        xTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTextField1ActionPerformed(evt);
            }
        });
        xFormPanel1.add(xTextField1);

        xComboBox1.setCaption("Org Type");
        xComboBox1.setExpression("#{item.name} ");
        xComboBox1.setItems("orgclassess");
        xComboBox1.setName("entity.data.orgclass"); // NOI18N
        xComboBox1.setCaptionWidth(120);
        xComboBox1.setImmediate(true);
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        xComboBox2.setCaption("Org Name");
        xComboBox2.setDepends(new String[] {"entity.data.orgclass"});
        xComboBox2.setExpression("#{item.name}");
        xComboBox2.setItems("orgs");
        xComboBox2.setName("entity.data.org"); // NOI18N
        xComboBox2.setCaptionWidth(120);
        xComboBox2.setDynamic(true);
        xComboBox2.setImmediate(true);
        xComboBox2.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox2.setRequired(true);
        xFormPanel1.add(xComboBox2);

        xComboBox3.setCaption("Output Format");
        xComboBox3.setItems("formats");
        xComboBox3.setName("entity.data.outputformat"); // NOI18N
        xComboBox3.setCaptionWidth(120);
        xComboBox3.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xComboBox3.setDynamic(true);
        xComboBox3.setImmediate(true);
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox3.setRequired(true);
        xFormPanel1.add(xComboBox3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xTextField1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}
