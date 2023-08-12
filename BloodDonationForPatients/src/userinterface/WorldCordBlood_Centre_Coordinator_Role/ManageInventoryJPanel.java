/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WorldCordBlood_Centre_Coordinator_Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import Business.People.Donor;
import Magic.Design.*;
import Business.People.Patient;
import Magic.Design.MyJLabel;
import Business.People.PatientRequest;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jared
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    private EcoSystem system;
      private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    ManageInventoryJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        this.system = system;
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setMinimumSize(new java.awt.Dimension(1100, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("                                                                         Manage Inventory");
        jPanel3.add(jLabel25);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
