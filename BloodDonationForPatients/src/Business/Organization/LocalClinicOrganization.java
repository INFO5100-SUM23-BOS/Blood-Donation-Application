/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BloodTypes.BloodCount;
import Business.BloodTypes.PersonBloodTypes;
import Business.Role.LocalClinicStaffRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author saiku
 */
public class LocalClinicOrganization extends Organization{
        BloodCount inventory;
    

    public LocalClinicOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.LocalClinic.getValue() : name, parent);
        inventory = new BloodCount();

    }

    public BloodCount getInventory() {
        return inventory;
    }
    
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getBloodTypeComboCounts();
    }

    public void setInventory(BloodCount inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LocalClinicStaffRole());
        return roles;
    }
     
    
}
