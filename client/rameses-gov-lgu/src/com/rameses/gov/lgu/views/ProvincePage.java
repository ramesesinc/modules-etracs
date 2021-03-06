/*
 * MunicipalityPage.java
 *
 * Created on July 31, 2013, 9:19 PM
 */

package com.rameses.gov.lgu.views;



import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

/**
 *
 * @author  Elmo
 */
@Template(CrudFormPage.class)
@StyleSheet
public class ProvincePage extends javax.swing.JPanel {
    
    public ProvincePage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        xFormPanel5 = new com.rameses.rcp.control.XFormPanel();
        xTextField12 = new com.rameses.rcp.control.XTextField();
        xTextField13 = new com.rameses.rcp.control.XTextField();
        xTextField14 = new com.rameses.rcp.control.XTextField();
        xFormPanel6 = new com.rameses.rcp.control.XFormPanel();
        xTextField15 = new com.rameses.rcp.control.XTextField();
        xTextField16 = new com.rameses.rcp.control.XTextField();
        xTextField17 = new com.rameses.rcp.control.XTextField();
        xFormPanel7 = new com.rameses.rcp.control.XFormPanel();
        xTextField18 = new com.rameses.rcp.control.XTextField();
        xTextField19 = new com.rameses.rcp.control.XTextField();
        xTextField20 = new com.rameses.rcp.control.XTextField();
        xFormPanel8 = new com.rameses.rcp.control.XFormPanel();
        xTextField21 = new com.rameses.rcp.control.XTextField();
        xTextField22 = new com.rameses.rcp.control.XTextField();
        xFormPanel10 = new com.rameses.rcp.control.XFormPanel();
        xTextField30 = new com.rameses.rcp.control.XTextField();
        xTextField26 = new com.rameses.rcp.control.XTextField();
        xTextField27 = new com.rameses.rcp.control.XTextField();
        xTextField28 = new com.rameses.rcp.control.XTextField();

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        xFormPanel5.setCaptionWidth(120);
        xFormPanel5.setIndex(1);

        xTextField12.setCaption("Governor Name");
        xTextField12.setIndex(10);
        xTextField12.setName("entity.governor.name"); // NOI18N
        xTextField12.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField12.setRequired(true);
        xFormPanel5.add(xTextField12);

        xTextField13.setCaption("Governor Title");
        xTextField13.setIndex(11);
        xTextField13.setName("entity.governor.title"); // NOI18N
        xTextField13.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField13.setRequired(true);
        xFormPanel5.add(xTextField13);

        xTextField14.setCaption("Governor Office");
        xTextField14.setIndex(12);
        xTextField14.setName("entity.governor.office"); // NOI18N
        xTextField14.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField14.setRequired(true);
        xFormPanel5.add(xTextField14);

        xFormPanel6.setCaptionWidth(120);
        xFormPanel6.setIndex(2);

        xTextField15.setCaption("Assessor Name");
        xTextField15.setIndex(13);
        xTextField15.setName("entity.assessor.name"); // NOI18N
        xTextField15.setNullWhenEmpty(false);
        xTextField15.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField15.setRequired(true);
        xFormPanel6.add(xTextField15);

        xTextField16.setCaption("Assessor Title");
        xTextField16.setIndex(14);
        xTextField16.setName("entity.assessor.title"); // NOI18N
        xTextField16.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField16.setRequired(true);
        xFormPanel6.add(xTextField16);

        xTextField17.setCaption("Assessor Office");
        xTextField17.setIndex(15);
        xTextField17.setName("entity.assessor.office"); // NOI18N
        xTextField17.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField17.setRequired(true);
        xFormPanel6.add(xTextField17);

        xFormPanel7.setCaptionWidth(120);
        xFormPanel7.setIndex(3);

        xTextField18.setCaption("Treasurer Name");
        xTextField18.setIndex(16);
        xTextField18.setName("entity.treasurer.name"); // NOI18N
        xTextField18.setNullWhenEmpty(false);
        xTextField18.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField18.setRequired(true);
        xFormPanel7.add(xTextField18);

        xTextField19.setCaption("Treasurer Title");
        xTextField19.setIndex(17);
        xTextField19.setName("entity.treasurer.title"); // NOI18N
        xTextField19.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField19.setRequired(true);
        xFormPanel7.add(xTextField19);

        xTextField20.setCaption("Treasurer Office");
        xTextField20.setIndex(18);
        xTextField20.setName("entity.treasurer.office"); // NOI18N
        xTextField20.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField20.setRequired(true);
        xFormPanel7.add(xTextField20);

        xFormPanel8.setCaptionWidth(120);
        xFormPanel8.setIndex(1);

        xTextField21.setCaption("Full Name");
        xTextField21.setIndex(10);
        xTextField21.setName("entity.fullname"); // NOI18N
        xTextField21.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField21.setRequired(true);
        xFormPanel8.add(xTextField21);

        xTextField22.setCaption("Address");
        xTextField22.setIndex(10);
        xTextField22.setName("entity.address"); // NOI18N
        xTextField22.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField22.setRequired(true);
        xFormPanel8.add(xTextField22);

        xFormPanel10.setCaptionWidth(120);
        xFormPanel10.setIndex(1);

        xTextField30.setCaption("Province code");
        xTextField30.setEnabled(false);
        xTextField30.setIndex(12);
        xTextField30.setName("entity.code"); // NOI18N
        xTextField30.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel10.add(xTextField30);

        xTextField26.setCaption("Province Name");
        xTextField26.setEnabled(false);
        xTextField26.setIndex(10);
        xTextField26.setName("entity.name"); // NOI18N
        xTextField26.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel10.add(xTextField26);

        xTextField27.setCaption("Index No");
        xTextField27.setEnabled(false);
        xTextField27.setIndex(11);
        xTextField27.setName("entity.indexno"); // NOI18N
        xTextField27.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel10.add(xTextField27);

        xTextField28.setCaption("PIN");
        xTextField28.setEnabled(false);
        xTextField28.setIndex(12);
        xTextField28.setName("entity.pin"); // NOI18N
        xTextField28.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel10.add(xTextField28);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xFormPanel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 441, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xFormPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .add(xFormPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .add(xFormPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .add(xFormPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(xFormPanel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xFormPanel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xFormPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xFormPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(xFormPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(72, 72, 72))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 449, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel10;
    private com.rameses.rcp.control.XFormPanel xFormPanel5;
    private com.rameses.rcp.control.XFormPanel xFormPanel6;
    private com.rameses.rcp.control.XFormPanel xFormPanel7;
    private com.rameses.rcp.control.XFormPanel xFormPanel8;
    private com.rameses.rcp.control.XTextField xTextField12;
    private com.rameses.rcp.control.XTextField xTextField13;
    private com.rameses.rcp.control.XTextField xTextField14;
    private com.rameses.rcp.control.XTextField xTextField15;
    private com.rameses.rcp.control.XTextField xTextField16;
    private com.rameses.rcp.control.XTextField xTextField17;
    private com.rameses.rcp.control.XTextField xTextField18;
    private com.rameses.rcp.control.XTextField xTextField19;
    private com.rameses.rcp.control.XTextField xTextField20;
    private com.rameses.rcp.control.XTextField xTextField21;
    private com.rameses.rcp.control.XTextField xTextField22;
    private com.rameses.rcp.control.XTextField xTextField26;
    private com.rameses.rcp.control.XTextField xTextField27;
    private com.rameses.rcp.control.XTextField xTextField28;
    private com.rameses.rcp.control.XTextField xTextField30;
    // End of variables declaration//GEN-END:variables
    
}
