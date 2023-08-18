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
import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.People.Patient;
import Business.People.PatientRequest;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.System_Coordinator_Test_WorkRequest;
import Business.WorkQueue.WorkRequest;
import Magic.Design.MyTableFormat;
import java.awt.Color;
import java.awt.Image;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 * @author nitin
 */
public class VolunteerReceiverRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerReceiverRequestJPanel
     */
    private  EcoSystem system;
    private PatientRequest patientRequest;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount userAccount;
    private Network network;
    
    public VolunteerReceiverRequestJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        requestTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateRequestTable();
    }
  

    private void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) requestTable.getModel();
        
        dtm.setRowCount(0);
        
         for(PatientRequest patientRequest: system.getPatientRequestDirectory().getPatientRequestList()){            
            Object row[] = new Object[4];
            row[0]= patientRequest;
            row[1]= patientRequest.getName();
            row[2]= patientRequest.getContact();
            row[3]= patientRequest.getStatus();
              
            dtm.addRow(row);
        }   
         
        TableColumn testColumn = requestTable.getColumnModel().getColumn(3);
      JComboBox<String> comboBox = new JComboBox<>();
      comboBox.addItem("Approved");
      comboBox.addItem("Rejected");
      comboBox.addItem("Cancelled");
     
      testColumn.setCellEditor(new DefaultCellEditor(comboBox));
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonReject = new javax.swing.JButton();
        buttonApprove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        hlaText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        labConfirmationText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        statusText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblProfilePicture = new javax.swing.JLabel();
        dobDateField = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonReject.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonReject.setText("Reject");
        buttonReject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonReject.setEnabled(false);
        buttonReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRejectActionPerformed(evt);
            }
        });
        add(buttonReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 100, 40));

        buttonApprove.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonApprove.setText("Approve");
        buttonApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonApprove.setEnabled(false);
        buttonApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApproveActionPerformed(evt);
            }
        });
        add(buttonApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 110, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("UID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        nameText.setEditable(false);
        nameText.setBackground(new java.awt.Color(255, 255, 255));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 190, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("DOB");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Age");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 190, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setText("Contact Number");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextActionPerformed(evt);
            }
        });
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 180, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setText("Email ID");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 190, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 70, -1));

        genderText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(genderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 180, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("Blood Group");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        hlaText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        hlaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlaTextActionPerformed(evt);
            }
        });
        add(hlaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 190, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("Street address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 176, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setText("City");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 180, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        stateText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(stateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 180, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setText("ZipCode");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel19.setText("\"Confirmed by a medical practitioner: Do you meet the minimum hematocrit level for blood donation?\"     ");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Patient Request Handling");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(535, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, -1));

        labConfirmationText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(labConfirmationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 210, -1));

        requestTable.setBackground(new java.awt.Color(0, 0, 0));
        requestTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        requestTable.setForeground(new java.awt.Color(255, 255, 255));
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.setFocusable(false);
        requestTable.setGridColor(new java.awt.Color(0, 0, 0));
        requestTable.setRowHeight(30);
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 980, 190));

        statusText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 200, -1));

        jLabel1.setText("Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 11, -1, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        lblProfilePicture.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 160, 140));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 180, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Status");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 20, 200));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 860, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel4.setText("Patient History Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel5.setText("Location Details");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApproveActionPerformed
        // TODO add your handling code here:
        if( !statusText.getText().equals("New Request"))
            {
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request can not be approved!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
                
            //    JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
            }
        
        else
        {
        
        Patient patient = new Patient();
        
        try {

            patient.getHLA().updateBloodTypelist(hlaText.getText());
        }
        catch (Exception e) {
                            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Please check the patients blood group. It Should be AN,AP,BP,BN,ABP,ABN,OP,ON where N-Negative, P-Positive.</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        
        patient.setName(nameText.getText());
        patient.setContact(Long.parseLong(contactText.getText()));  
        
        patient.setReceiverID(uidText.getText()); // UID, receiverID
        patient.setName(nameText.getText()); // Name
       
       
        
        patient.setAge(Integer.parseInt(ageText.getText())); // Age
        patient.setGender(genderText.getText()); // gender
        
        patient.setStreetAddress(streetText.getText()); // streetAddress
        patient.setCity(cityText.getText()); // city
        patient.setState(stateText.getText()); // state
        patient.setZipCode(Integer.parseInt(zipText.getText())); // zipCode
        patient.setContact(Long.parseLong(contactText.getText())); // contact
        patient.setEmailID(emailText.getText()); // emailID
        patient.setStatus("Centre Approved"); // status
        patient.setLabConfirmation(true); //  labConfirmation
        system.getPatientDirectory().addPatient(patient);
      
        
        for(PatientRequest patientRequest: system.getPatientRequestDirectory().getPatientRequestList()){                      
        
            if(patientRequest.getReceiverID().equals(uidText.getText())){
            patientRequest.setStatus("Centre Approved");
            dB4OUtil.storeSystem(system);
            }
        }
       
        Enterprise ent = null;
        Organization org = null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("Legal")) {
            
                ent = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        
       
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof LogisticsOrganization) {
                org = organization;
                break;
            }
        }
        
        if (org != null) {
            // WORK REQUEST
        
            WorkRequest request = new System_Coordinator_Test_WorkRequest();

            request.setPatient(patient);
            request.setActionDate(new Date());
            request.setAssigned("Legal Department");
            request.setSummary("Requested for BoneMarrow Reception");
            request.setStatus("Assigned to Legal Department");

            request.setUserAccount(userAccount);
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org.getName());
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            //user.addUserRequest(request);
            
            dB4OUtil.storeSystem(system);
            populateRequestTable();
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request approved successfully!</b></html>"));
            statusText.setText("Centre Approved");
           
            //JOptionPane.showMessageDialog(null,"Request Sent Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
         return;
        }

        
        dB4OUtil.storeSystem(system);
        populateRequestTable();
      //  JOptionPane.showMessageDialog(null,"New patient has been added!");
        
        }
    }//GEN-LAST:event_buttonApproveActionPerformed

    private void buttonRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRejectActionPerformed
        // TODO add your handling code here:
        
       if(!statusText.getText().equals("New Request"))
                  {
                      JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request can not be rejected!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
          
                     // JOptionPane.showMessageDialog(null,"Can Not Reject the Request!");
        }
       else{
        for(PatientRequest patientRequest: system.getPatientRequestDirectory().getPatientRequestList()){                      
        
            if(patientRequest.getName().equals(nameText.getText())){
            statusText.setText("Rejected");
            patientRequest.setStatus("Rejected");
            }}
        
        dB4OUtil.storeSystem(system);   
        populateRequestTable();
        
         JOptionPane.showMessageDialog(null, new JLabel("<html><b>Request has been rejected!</b></html>"));
        
        //JOptionPane.showMessageDialog(null,"Rejected the Patient's Request!");
        }
       
        
    }//GEN-LAST:event_buttonRejectActionPerformed

    private void contactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextActionPerformed

    private void requestTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMousePressed
        int selectedRow = requestTable.getSelectedRow();
        if(selectedRow < 0){
        }
        else{
       //display the details 
            patientRequest = (PatientRequest) requestTable.getValueAt(selectedRow, 0);
            populateRequestDetails(patientRequest);
            buttonApprove.setEnabled(true);
            buttonReject.setEnabled(true);
            
            if(Integer.parseInt(ageText.getText()) < 18)
            {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
            }
            else {
                ageText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                ageText.setForeground(Color.black);
            }
            if(labConfirmationText.getText().equals("false"))
            {
                labConfirmationText.setBorder(BorderFactory.createLineBorder(Color.RED));
                labConfirmationText.setForeground(Color.red);
            }
            if(patientRequest.getStatus().equals("New Request")){
                buttonApprove.setEnabled(true);
                buttonReject.setEnabled(true);
            }
            else {
                buttonApprove.setEnabled(false);
                buttonReject.setEnabled(false);
            }
            
            
             dB4OUtil.storeSystem(system);
            
            
        }
    }//GEN-LAST:event_requestTableMousePressed

    private void hlaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hlaTextActionPerformed

    private void statusTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JButton buttonApprove;
    private javax.swing.JButton buttonReject;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField genderText;
    private javax.swing.JTextField hlaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField labConfirmationText;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField stateText;
    private javax.swing.JTextField statusText;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables

    private void populateRequestDetails(PatientRequest patientRequest) {
            uidText.setText(patientRequest.getReceiverID());
            nameText.setText(patientRequest.getName());
            dobDateField.setDate(patientRequest.getDob());
            ageText.setText(String.valueOf(patientRequest.getAge()));
            genderText.setText(patientRequest.getGender());
            hlaText.setText(String.join(", ", (Iterable<String>) patientRequest.getHla().getBloodTypeValuesList()));
            streetText.setText(patientRequest.getStreetAddress());
            cityText.setText(patientRequest.getCity());
            stateText.setText(patientRequest.getState());
            zipText.setText(String.valueOf(patientRequest.getZipCode()));
            contactText.setText(String.valueOf(patientRequest.getContact()));
            emailText.setText(patientRequest.getEmailID());
            statusText.setText(patientRequest.getStatus());
            
            labConfirmationText.setText(String.valueOf(patientRequest.isLabConfirmation()));
            
            
            
            
             if(patientRequest.getdP() !=null){
            //Working line
            byte[] JLabelpictureLabel = patientRequest.getdP();
            ImageIcon i = setPicturebyte(JLabelpictureLabel);
            lblProfilePicture.setIcon(i);
            }
            else{
            System.err.println("No Image");
            }
             
             
            uidText.setEditable(false);
            nameText.setEditable(false);
            ageText.setEditable(false);
            genderText.setEditable(false);
            hlaText.setEditable(false);
            streetText.setEditable(false);
            cityText.setEditable(false);
            stateText.setEditable(false);
            zipText.setEditable(false);
            contactText.setEditable(false);
            emailText.setEditable(false);
            statusText.setEditable(false);
            labConfirmationText.setEditable(false);     
            dobDateField.setEnabled(false);
    }
    
    private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  

    
    }
}
