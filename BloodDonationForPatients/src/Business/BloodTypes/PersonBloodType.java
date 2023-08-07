/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author j.videlefsky
 */
public class PersonBloodType {
//    private String bloodType;
    private ArrayList<BloodType> bloodTypeList = new ArrayList();
    // eligible donors and recipients attributes
    private ArrayList<BloodType> eligibleDonors;
    private ArrayList<BloodType> eligibleRecipients;
    
    public PersonBloodType() {
        bloodTypeList = new ArrayList<>();
    }
//    public PersonBloodType(String bloodType) {
//        this.bloodType = bloodType;
//    }
    
public enum BloodType {
    AP("AP"),
    AN("AN"),
    BP("BP"),
    BN("BN"),
    ABP("ABP"),
    ABN("ABN"),
    OP("OP"),
    ON("ON");

    private String value;

    private BloodType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
       public static BloodType fromValue(String value) {
        for (BloodType bloodType : values()) {
            if (bloodType.value.equals(value)) {
                return bloodType;
            }
        }
        throw new IllegalArgumentException("No enum constant for value: " + value);
    }
    }

    
    // Add donor and recipient types
    public void addDonorType(BloodType bloodType){
        eligibleDonors.add(bloodType);
    }
    public void addRecipientType(BloodType bloodType){
        eligibleRecipients.add(bloodType);
    }
    
    // Set all bloodtypes
//    BloodType aPlus = new BloodType();
    // Add values to bloodtypes
    

    public ArrayList<BloodType> getBloodTypeList() {
        return bloodTypeList;
    }
    
    public ArrayList<String> getBloodTypeValuesList() {
        ArrayList<String> bloodTypeValuesList = new ArrayList<String>();
        for(BloodType bt : this.bloodTypeList) {
            bloodTypeValuesList.add(bt.getValue());
        }
        
        return bloodTypeValuesList;
    }

    public void setBloodTypeList(ArrayList<BloodType> bloodTypeList) {
        this.bloodTypeList = bloodTypeList;
    }
    
    public void addHLA(BloodType bloodType) {
        
        for(BloodType t : this.getBloodTypeList()) {
            if(t.getValue().equals(bloodType.getValue())) {
                System.out.println("");
                return;
            }
        }
        
        this.getBloodTypeList().add(bloodType);
    }
    
    public void updateBloodTypelist(String bloodTypeList) {
        this.bloodTypeList = new ArrayList<BloodType>();
        try {
            for(String bloodType: bloodTypeList.split(",")) {
                this.bloodTypeList.add(BloodType.valueOf(bloodType.trim()));
            }
        }
        catch (Exception e){
            System.out.println(e);
            this.bloodTypeList.add(BloodType.valueOf(bloodTypeList));
        }
    }
    
    public void removeBloodType(BloodType bloodType) {
//        for(HLAType t : this.hla.getHlaList()) {
//            if(t.getValue().equals(hlaType.getValue())) {
//                System.out.println("HLAType already in patient's HLA List");
//                return;
//            }
//        }
        this.getBloodTypeList().remove(bloodType);
    }
    
    public static PersonBloodType createHLA(String hlaList) {
        PersonBloodType pHLA = new PersonBloodType();
        pHLA.updateBloodTypelist(hlaList);
        return pHLA;
    }
    
}
