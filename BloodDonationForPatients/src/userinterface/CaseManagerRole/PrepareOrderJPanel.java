/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HeadquarterOrganization;
import Business.People.Donor;
import Magic.Design.*;
import Business.People.Patient;
import Business.People.PatientDirectory;
import Magic.Design.MyJLabel;
import Business.People.PatientRequest;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jared
 */
public class PrepareOrderJPanel extends javax.swing.JPanel {

     EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
       boolean a = true;
    private UserAccount userAccount;
    HeadquarterOrganization bloodBankOrganization;
    Enterprise enterprise;
    PatientDirectory patientDirectory;
    private Network network;
    JPanel jpanel;
    
    PrepareOrderJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        this.system = system;
        this.jpanel=jPanel3;
         patientTable1.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populatePatientRequestsTable();
        
    }
    
     private void populatePatientRequestsTable(){
        DefaultTableModel dtm = (DefaultTableModel) patientTable1.getModel();
        
        dtm.setRowCount(0);
        
         for(PatientRequest patient: system.getPatientRequestDirectory().getPatientRequestList())
         {            
            Object row[] = new Object[4];
            row[0]= patient;
            row[1]=patient.getName();
            row[2]=patient.getContact();
            row[3]=patient.getStatus();
              
            dtm.addRow(row);
         }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPrepareOrder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 153, 153));
        setMinimumSize(new java.awt.Dimension(1100, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("All Patient Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        btnPrepareOrder.setBackground(new java.awt.Color(204, 204, 204));
        btnPrepareOrder.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPrepareOrder.setText("View Details");
        btnPrepareOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrepareOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepareOrderActionPerformed(evt);
            }
        });
        add(btnPrepareOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 170, 40));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));
        jPanel3.setLayout(new java.awt.CardLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("New Requests");
        jPanel3.add(jLabel25, "card2");

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));

        patientTable1.setBackground(new java.awt.Color(0, 0, 0));
        patientTable1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        patientTable1.setForeground(new java.awt.Color(255, 255, 255));
        patientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientTable1.setFocusable(false);
        patientTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(patientTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 730, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrepareOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepareOrderActionPerformed
     
        
        ViewRequestJPanel panel = new ViewRequestJPanel(jpanel,system, userAccount, network, bloodBankOrganization,  enterprise);
        jPanel3.add("ViewRequestJPanel", panel);
        CardLayout layout;
         layout = (CardLayout) jPanel3.getLayout();
        layout.next(jPanel3);
        
    }//GEN-LAST:event_btnPrepareOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrepareOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientTable1;
    // End of variables declaration//GEN-END:variables

   
}