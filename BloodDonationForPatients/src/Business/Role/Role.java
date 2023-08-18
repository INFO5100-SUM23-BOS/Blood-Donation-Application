/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author balumullamuri
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        CaseManager("Case Manager"),
        GovernmentAgent("Government Agent"),
        LabEmployee("Lab Employee"),
        LocalClinic("Local Clinic Staff"),
        LogisticsOfficer("Logistics Officer");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
