/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Blood_Centre_Coordinator_Role;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saiku
 */
public class WorldCord_Centre_Organization extends Organization {
     public WorldCord_Centre_Organization() {
        super(Organization.BloodCentreType.BloodCentre.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Blood_Centre_Coordinator_Role());
        return roles;
    }
    
}
