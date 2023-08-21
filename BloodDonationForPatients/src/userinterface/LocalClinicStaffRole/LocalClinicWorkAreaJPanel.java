/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LocalClinicStaffRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LocalClinicOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import userinterface.CommonPanels.BloodRequestsListJPanel;

/**
 *
 * @author balumullamuri
 */


public class LocalClinicWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BoneMarrowBankCoordinatorWorkAreaJPanel
     */
    boolean a = true;
    private UserAccount userAccount;
    private LocalClinicOrganization bmBankOrganization;
    private Enterprise enterprise;
    private EcoSystem system;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public LocalClinicWorkAreaJPanel(UserAccount account, LocalClinicOrganization bmBankOrganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userAccount = account;
        this.bmBankOrganization = bmBankOrganization;
        this.enterprise = enterprise;
        this.system = business;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        BtnManageRequests = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.GridLayout(1, 0));

        BtnManageRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageRequests.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageRequests.setText("Blood Administration");
        BtnManageRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageRequestsMouseClicked(evt);
            }
        });
        Header.add(BtnManageRequests);

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(255, 153, 153));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnManageRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageRequestsMouseClicked
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        BloodRequestsListJPanel panel = new BloodRequestsListJPanel(system, userAccount, network, userProcessContainer);
        userProcessContainer.add("BloodRequestsListJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnManageRequestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnManageRequests;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
