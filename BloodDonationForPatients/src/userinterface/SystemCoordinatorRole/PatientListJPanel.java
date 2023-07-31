/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Magic.Design.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.SystemCoordinatorOrganization;
import Business.People.Patient;
import Business.People.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saiku
 */
public class PatientListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientListJPanel
     */
    //private JPanel userProcessContainerJPanel;
    private PatientDirectory patientDirectory;
    private UserAccount userAccount;
    private  EcoSystem system;
    private Network network;
    private SystemCoordinatorOrganization systorganization;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public PatientListJPanel(UserAccount userAccount, EcoSystem system, Network network, SystemCoordinatorOrganization systorganization) {
        initComponents();
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
        this.systorganization = systorganization;
       
        tblAssignment.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblHospital.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateHospitalTable();
        populateRequestTable();
    }


    
    
    private void populateHospitalTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblHospital.getModel();
        dtm.setRowCount(0);
        
        System.out.println("list of enterprises:");
       // System.out.println(Enterprise_Directory.getEnterpriseList());
        System.out.println("list of enterprises ends");
        System.out.println(network.getName());
        for (Enterprise enterprise : network.getEnterprise_Directory().getEnterpriseList()){
            if(enterprise.getEnterpriseType().toString().equals("Hospital")){
                System.out.println("Hosp");
                Object[] row = new Object[2];
                row[0] = enterprise;
                row[1] = enterprise.getName();
                
                dtm.addRow(row);
        }
        }       
        }
    
     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel)tblAssignment.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : systorganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getEnterprise();
            row[4] = request.getStatus();
//            row[5] = request.getPatient().isEmergencyStatus();
            
            model.addRow(row);
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
        jLabel2 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAssignment = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setMinimumSize(new java.awt.Dimension(1150, 730));
        setPreferredSize(new java.awt.Dimension(1150, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Patients in need of Blood Transfusion");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Assign the Patient to a Hospital");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        btnAssign.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.setBorder(new javax.swing.border.MatteBorder(null));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 120, 30));

        tblHospital.setBackground(new java.awt.Color(0, 0, 0));
        tblHospital.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblHospital.setForeground(new java.awt.Color(255, 255, 255));
        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospital.setGridColor(new java.awt.Color(0, 0, 0));
        tblHospital.setRowHeight(30);
        jScrollPane2.setViewportView(tblHospital);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 810, 150));

        tblAssignment.setBackground(new java.awt.Color(0, 0, 0));
        tblAssignment.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblAssignment.setForeground(new java.awt.Color(255, 255, 255));
        tblAssignment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient UID", "Hospital Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAssignment.setGridColor(new java.awt.Color(0, 0, 0));
        tblAssignment.setRowHeight(30);
        jScrollPane4.setViewportView(tblAssignment);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 900, 170));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Connect Patient to Hospital");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 1640, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int row = tblAssignment.getSelectedRow();
        int row1 = tblHospital.getSelectedRow();
        if (row < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row from the Request table", "Warning", JOptionPane.WARNING_MESSAGE);
            //return;
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the Request Table</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (row1 < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row from the Hospital table", "Warning", JOptionPane.WARNING_MESSAGE);
            //return;
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the Hospital Table</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        else{
            WorkRequest request = (WorkRequest)tblAssignment.getValueAt(row, 0);   
            if(request.getStatus().equals("BoneMarrowBank Approved. Passing to System Coordinator")){
                    
                    request.setEnterprise((Enterprise) tblHospital.getValueAt(row1, 0));
                    request.setStatus("Assigned to Hospital");
                    
                    dB4OUtil.storeSystem(system);
                    populateRequestTable();
                    
                    
                    Organization org = null;
                    Enterprise enterprise = (Enterprise) tblHospital.getValueAt(row1, 0);
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof DoctorOrganization) {
                                org = organization;
                                break;
                            }
                    }
                    if (org != null) {
                        org.getWorkQueue().getWorkRequestList().add(request);
                        System.out.println(org.getName());
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(null,
                                new JLabel(  "<html><b>Patient successfully assigned to the Hospital.</b></html>"), 
                                 "Info", JOptionPane.INFORMATION_MESSAGE);
                        populateRequestTable();
                    }
                    else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }   
            else{
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Work Request is already in progress!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                }
        
        }
        dB4OUtil.storeSystem(system);
        populateRequestTable();
                
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblAssignment;
    private javax.swing.JTable tblHospital;
    // End of variables declaration//GEN-END:variables
}
