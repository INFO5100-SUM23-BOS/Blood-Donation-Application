/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package HomePages;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author maka
 */
public class MainWorkArea extends javax.swing.JPanel {
    
    
     JPanel mainProcessContainer;
     JPanel workAreaPanel;
     EcoSystem system;
     

    /** Creates new form MainWorkArea */
    public MainWorkArea(EcoSystem system, JPanel mainProcessContainer, JPanel workAreaPanel) {
        initComponents();
        this.system = system;
        this.mainProcessContainer = mainProcessContainer;
        this.workAreaPanel = workAreaPanel;
        
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        workAreaContainer.add("LoggedInWorkArea", workAreaPanel);
        layout.next(workAreaContainer);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        actionBar = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        workAreaContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 153, 153));

        splitPane.setBackground(new java.awt.Color(255, 153, 153));
        splitPane.setDividerLocation(30);
        splitPane.setDividerSize(3);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        actionBar.setBackground(new java.awt.Color(255, 153, 153));

        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionBarLayout = new javax.swing.GroupLayout(actionBar);
        actionBar.setLayout(actionBarLayout);
        actionBarLayout.setHorizontalGroup(
            actionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionBarLayout.createSequentialGroup()
                .addContainerGap(1192, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(16, 16, 16))
        );
        actionBarLayout.setVerticalGroup(
            actionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        splitPane.setTopComponent(actionBar);

        workAreaContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workAreaContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        mainProcessContainer.add("LoginJPanel",new LoginJPanel(system, mainProcessContainer));
        CardLayout layout = (CardLayout) mainProcessContainer.getLayout();
        layout.next(mainProcessContainer);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionBar;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workAreaContainer;
    // End of variables declaration//GEN-END:variables

}
