/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.WorldCord_Centre_Organization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.WorldCordBlood_Centre_Coordinator_Role.WorldCordBlood_Centre_Coordinator_WorkAreaJPanel;

/**
 *
 * @author balumullamuri
 */
public class Blood_Centre_Coordinator_Role extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new WorldCordBlood_Centre_Coordinator_WorkAreaJPanel(account, (WorldCord_Centre_Organization) organization, enterprise, business, network);
    }
}
