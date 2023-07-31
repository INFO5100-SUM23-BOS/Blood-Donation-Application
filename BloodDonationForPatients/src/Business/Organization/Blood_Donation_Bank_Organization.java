/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BloodTypes.BloodCount;
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
public class Blood_Donation_Bank_Organization extends Organization{
        BloodCount inventory;
    

    public Blood_Donation_Bank_Organization() {
        super(Organization.BloodBankType.BloodDonationBank.getValue());
        inventory = new BloodCount();

        // Blood Type A+ and AB+ donors
        PersonBloodType a_Pos_Donor = new PersonBloodType();
        a_Pos_Donor.addHLA(PersonBloodType.BloodType.A_POS);
        a_Pos_Donor.addHLA(PersonBloodType.BloodType.AB_POS);
        inventory.bloodTypeComboCountAdd(a_Pos_Donor, 6);

        // Blood Type A- donors
        PersonBloodType a_Neg_Donor = new PersonBloodType();
        a_Neg_Donor.addHLA(PersonBloodType.BloodType.A_NEG);
        a_Neg_Donor.addHLA(PersonBloodType.BloodType.AB_NEG);
        inventory.bloodTypeComboCountAdd(a_Neg_Donor, 5);

        // Blood Type A+, A-, B+, B-, AB+, AB-, O+, O- recipients
        PersonBloodType a_Pos_Recipient = new PersonBloodType();
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.A_POS);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.A_NEG);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.B_POS);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.B_NEG);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.AB_POS);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.AB_NEG);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.O_POS);
        a_Pos_Recipient.addHLA(PersonBloodType.BloodType.O_NEG);
        inventory.bloodTypeComboCountAdd(a_Pos_Recipient, 7);

        // Blood Type A-, O- recipients
        PersonBloodType a_Neg_Recipient = new PersonBloodType();
        a_Neg_Recipient.addHLA(PersonBloodType.BloodType.A_NEG);
        a_Neg_Recipient.addHLA(PersonBloodType.BloodType.O_NEG);
        inventory.bloodTypeComboCountAdd(a_Neg_Recipient, 5);

        // Blood Type B+ and AB+ donors
        PersonBloodType b_Pos_Donor = new PersonBloodType();
        b_Pos_Donor.addHLA(PersonBloodType.BloodType.B_POS);
        b_Pos_Donor.addHLA(PersonBloodType.BloodType.AB_POS);
        inventory.bloodTypeComboCountAdd(b_Pos_Donor, 6);

        // Blood Type B- donors
        PersonBloodType b_Neg_Donor = new PersonBloodType();
        b_Neg_Donor.addHLA(PersonBloodType.BloodType.B_NEG);
        b_Neg_Donor.addHLA(PersonBloodType.BloodType.AB_NEG);
        inventory.bloodTypeComboCountAdd(b_Neg_Donor, 5);

        // Blood Type AB+ donors
        PersonBloodType ab_Pos_Donor = new PersonBloodType();
        ab_Pos_Donor.addHLA(PersonBloodType.BloodType.AB_POS);
        inventory.bloodTypeComboCountAdd(ab_Pos_Donor, 6);

        // Blood Type AB- donors
        PersonBloodType ab_Neg_Donor = new PersonBloodType();
        ab_Neg_Donor.addHLA(PersonBloodType.BloodType.AB_NEG);
        inventory.bloodTypeComboCountAdd(ab_Neg_Donor, 5);

        // Blood Type O+ recipients
        PersonBloodType o_Pos_Recipient = new PersonBloodType();
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.O_POS);
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.A_POS);
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.B_POS);
        o_Pos_Recipient.addHLA(PersonBloodType.BloodType.AB_POS);
        inventory.bloodTypeComboCountAdd(o_Pos_Recipient, 7);

        // Blood Type O- recipients
        PersonBloodType o_Neg_Recipient = new PersonBloodType();
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.O_NEG);
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.A_NEG);
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.B_NEG);
        o_Neg_Recipient.addHLA(PersonBloodType.BloodType.AB_NEG);
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
        roles.add(new Blood_Bank_CoordinatorRole());
        return roles;
    }
     
    
}
