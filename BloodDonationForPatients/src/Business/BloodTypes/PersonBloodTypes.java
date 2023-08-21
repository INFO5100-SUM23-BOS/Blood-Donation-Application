/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author j.videlefsky
 */
public class PersonBloodTypes {

    public enum BloodType {
        AP("A+"),
        AN("A-"),
        BP("B+"),
        BN("B-"),
        ABP("AB+"),
        ABN("AB-"),
        OP("O+"),
        ON("O-");

        private String value;
        ArrayList<BloodType> eligibleDonors; 
        ArrayList<BloodType> eligibleRecipients;
        
        private BloodType(String value) {
            this.value = value;
            eligibleDonors = new ArrayList<BloodType>();
            eligibleRecipients = new ArrayList<BloodType>();
        }
        
        public void addDonor(BloodType b){
            eligibleDonors.add(b);
        }
        
        public void addRecipient(BloodType b){
            eligibleDonors.add(b);
        }

        public String getValue() {
            return value;
        }
        
        public ArrayList<BloodType> getEligibleDonors(){
            return eligibleDonors;
        }

        public ArrayList<BloodType> getEligibleRecipients(){
            return eligibleRecipients;
        }
        
        @Override
        public String toString() {
            return value;
        }

    }

    private ArrayList<BloodType> bloodTypeList;
    // eligible donors and recipients attributes

    public PersonBloodTypes() {
        configureCompatibility();
        bloodTypeList = new ArrayList<BloodType>(Arrays.asList(BloodType.values()));
    }

    // Add values to bloodtypes
    public ArrayList<BloodType> getBloodTypeList() {
        return bloodTypeList;
    }

    public ArrayList<String> getBloodTypeValuesList() {
        ArrayList<String> bloodTypeValuesList = new ArrayList<String>();
        for (BloodType bt : this.bloodTypeList) {
            bloodTypeValuesList.add(bt.getValue());
        }

        return bloodTypeValuesList;
    }


    public BloodType findBloodType(String bloodTypeName) {
        for (BloodType bt : this.getBloodTypeList()) {
            if (bt.getValue().equals(bloodTypeName)) {
                return bt;
            }
        }
        return null;
    }
    
    
    private void configureCompatibility(){
        // AB+
        BloodType.ABP.addDonor(BloodType.ABP);
        BloodType.ABP.addDonor(BloodType.ABN);
        BloodType.ABP.addDonor(BloodType.AP);
        BloodType.ABP.addDonor(BloodType.AN);
        BloodType.ABP.addDonor(BloodType.BP);
        BloodType.ABP.addDonor(BloodType.BN);
        BloodType.ABP.addDonor(BloodType.OP);
        BloodType.ABP.addDonor(BloodType.ON);
        BloodType.ABP.addRecipient(BloodType.ABP);
        
        // AB-
        BloodType.ABN.addDonor(BloodType.ABN);
        BloodType.ABN.addDonor(BloodType.AN);
        BloodType.ABN.addDonor(BloodType.BN);
        BloodType.ABN.addDonor(BloodType.ON);
        BloodType.ABN.addRecipient(BloodType.ABP);
        BloodType.ABN.addRecipient(BloodType.ABN);
        
        // A+
        BloodType.AP.addDonor(BloodType.AP);
        BloodType.AP.addDonor(BloodType.AN);
        BloodType.AP.addDonor(BloodType.OP);
        BloodType.AP.addDonor(BloodType.ON);
        BloodType.AP.addRecipient(BloodType.ABP);
        BloodType.AP.addRecipient(BloodType.AP);
        
        // A-
        BloodType.AN.addDonor(BloodType.AN);
        BloodType.AN.addDonor(BloodType.ON);
        BloodType.AN.addRecipient(BloodType.ABP);
        BloodType.AN.addRecipient(BloodType.ABN);
        BloodType.AN.addRecipient(BloodType.AP);
        BloodType.AN.addRecipient(BloodType.AN);
        
        // B+
        BloodType.BP.addDonor(BloodType.BP);
        BloodType.BP.addDonor(BloodType.BN);
        BloodType.BP.addDonor(BloodType.OP);
        BloodType.BP.addDonor(BloodType.ON);
        BloodType.BP.addRecipient(BloodType.ABP);
        BloodType.BP.addRecipient(BloodType.BN);
        
        // B-
        BloodType.BN.addDonor(BloodType.BN);
        BloodType.BN.addDonor(BloodType.ON);
        BloodType.BN.addRecipient(BloodType.ABP);
        BloodType.BN.addRecipient(BloodType.ABN);
        BloodType.BN.addRecipient(BloodType.BP);
        BloodType.BN.addRecipient(BloodType.BN);
        
        // O+
        BloodType.OP.addDonor(BloodType.OP);
        BloodType.OP.addDonor(BloodType.ON);
        BloodType.OP.addRecipient(BloodType.ABP);
        BloodType.OP.addRecipient(BloodType.AP);
        BloodType.OP.addRecipient(BloodType.BP);
        BloodType.OP.addRecipient(BloodType.OP);
        
        // O-
        BloodType.ON.addDonor(BloodType.ON);
        BloodType.ON.addRecipient(BloodType.ABP);
        BloodType.ON.addRecipient(BloodType.ABN);
        BloodType.ON.addRecipient(BloodType.AP);
        BloodType.ON.addRecipient(BloodType.BP);
        BloodType.ON.addRecipient(BloodType.AN);
        BloodType.ON.addRecipient(BloodType.OP);
        BloodType.ON.addRecipient(BloodType.ON);
        
    }
    
}
