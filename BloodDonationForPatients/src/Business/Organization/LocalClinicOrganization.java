/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BloodTypes.BloodCount;
import Business.BloodTypes.PersonBloodType;
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

        // Blood Type A+ and AB+ donors
        PersonBloodType a_Pos_Donor = new PersonBloodType();
        a_Pos_Donor.addHLA(PersonBloodType.BloodType.AP);
        a_Pos_Donor.addHLA(PersonBloodType.BloodType.ABP);
        inventory.bloodTypeComboCountAdd(a_Pos_Donor, 6);

        // Blood Type A- donors
        PersonBloodType a_Neg_Donor = new PersonBloodType();
        a_Neg_Donor.addHLA(PersonBloodType.BloodType.AN);
        a_Neg_Donor.addHLA(PersonBloodType.BloodType.ABN);
        inventory.bloodTypeComboCountAdd(a_Neg_Donor, 5);

        // Blood Type A+, A-, B+, B-, AB+, AB-, O+, O- recipients
        PersonBloodType a_Pos_Recipient = new PersonBloodType();
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.AP);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.AN);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.BP);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.BN);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.ABP);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.ABN);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.OP);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.ON);
        inventory.bloodTypeComboCountAdd(a_Pos_Recipient, 7);

        // Blood Type A-, O- recipients
        PersonBloodType a_Neg_Recipient = new PersonBloodType();
        a_Neg_Recipient.addHLA(PersonBloodType.BloodType.AN);
        a_Neg_Recipient.addHLA(PersonBloodType.BloodType.ON);
        inventory.bloodTypeComboCountAdd(a_Neg_Recipient, 5);

        // Blood Type B+ and AB+ donors
        PersonBloodType b_Pos_Donor = new PersonBloodType();
        b_Pos_Donor.addHLA(PersonBloodType.BloodType.BP);
        b_Pos_Donor.addHLA(PersonBloodType.BloodType.ABP);
        inventory.bloodTypeComboCountAdd(b_Pos_Donor, 6);

        // Blood Type B- donors
        PersonBloodType b_Neg_Donor = new PersonBloodType();
        b_Neg_Donor.addHLA(PersonBloodType.BloodType.BN);
        b_Neg_Donor.addHLA(PersonBloodType.BloodType.ABN);
        inventory.bloodTypeComboCountAdd(b_Neg_Donor, 5);

        // Blood Type AB+ donors
        PersonBloodType ab_Pos_Donor = new PersonBloodType();
        ab_Pos_Donor.addHLA(PersonBloodType.BloodType.ABP);
        inventory.bloodTypeComboCountAdd(ab_Pos_Donor, 6);

        // Blood Type AB- donors
        PersonBloodType ab_Neg_Donor = new PersonBloodType();
        ab_Neg_Donor.addHLA(PersonBloodType.BloodType.ABN);
        inventory.bloodTypeComboCountAdd(ab_Neg_Donor, 5);

        // Blood Type O+ recipients
        PersonBloodType o_Pos_Recipient = new PersonBloodType();
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.OP);
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.AP);
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.BP);
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.ABP);
        inventory.bloodTypeComboCountAdd(o_Pos_Recipient, 7);

        // Blood Type O- recipients
        PersonBloodType o_Neg_Recipient = new PersonBloodType();
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.ON);
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.AN);
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.BN);
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.ABN);
        inventory.bloodTypeComboCountAdd(o_Neg_Recipient, 5);
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
