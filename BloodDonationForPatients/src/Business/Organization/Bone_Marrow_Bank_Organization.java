/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BloodTypes.HLACount;
import Business.BloodTypes.PersonBloodType;
import Business.Role.DoctorRole;
import Business.Role.Blood_Bank_CoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author saiku
 */
public class Bone_Marrow_Bank_Organization extends Organization{
        HLACount inventory;
    
    public Bone_Marrow_Bank_Organization() {
        super(Organization.BoneMarrowBankType.BoneMarrowBank.getValue());
        inventory = new HLACount();
        PersonBloodType h = new PersonBloodType();
        h.updateBloodTypelist("HLA_A,HLA_B");
        inventory.HLACountAdd(h,6);
        h = new PersonBloodType();
        h.updateBloodTypelist("HLA_A");
        inventory.HLACountAdd(h,5);
        h = new PersonBloodType();
        h.updateBloodTypelist("HLA_A,HLA_B,HLA_C");
        inventory.HLACountAdd(h,7);
    }

    public HLACount getInventory() {
        return inventory;
    }
    
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getHlaComboCounts();
    }

    public void setInventory(HLACount inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Blood_Bank_CoordinatorRole());
        return roles;
    }
     
    
}
