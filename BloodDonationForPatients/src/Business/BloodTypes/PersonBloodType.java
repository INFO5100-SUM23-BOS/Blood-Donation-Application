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
    private ArrayList<BloodType> bloodTypeList = new ArrayList();
    
    public PersonBloodType() {
        bloodTypeList = new ArrayList<>();
    }
    
    public enum BloodType{
//        HLA_A("HLA_A"),
//        HLA_B("HLA_B"),
//        HLA_C("HLA_C"),
//        HLA_DR("HLA_DR"),
//        HLA_DBQ1("HLA_DBQ1"),
        A_POS("A+"),
        A_NEG("A-"),
        B_POS("B+"),
        B_NEG("B-"),
        AB_POS("AB+"),
        AB_NEG("AB-"),
        O_POS("O+"),
        O_NEG("O-");
        
        // Eligible Blood Type Donors associated with each blood type
        public class EligibleDonorBloodTypes {
            // Create a Map to associate each blood type with matching donor blood types
            private final Map<BloodType, List<BloodType>> eligibleDonorBloodTypes;

            public EligibleDonorBloodTypes() {
                // Constructor
                eligibleDonorBloodTypes = createEligibleDonorBloodTypes();
            }

            public Map<BloodType, List<BloodType>> getEligibleDonorBloodTypes() {
                return eligibleDonorBloodTypes;
            }

            // Method to create the map of matching donor blood types
            // Which bloodtypes can this bloodtype donate to
            private Map<BloodType, List<BloodType>> createEligibleDonorBloodTypes() {
                Map<BloodType, List<BloodType>> matches = new HashMap<>();

                // Blood Type A+
                List<BloodType> a_Pos_Donors = new ArrayList<>();
                a_Pos_Donors.add(BloodType.A_POS);
                a_Pos_Donors.add(BloodType.AB_POS);
                matches.put(BloodType.A_POS, a_Pos_Donors);

                // Blood Type A-
                List<BloodType> a_Neg_Donors = new ArrayList<>();
                a_Neg_Donors.add(BloodType.A_POS);
                a_Neg_Donors.add(BloodType.A_NEG);
                a_Neg_Donors.add(BloodType.AB_POS);
                a_Neg_Donors.add(BloodType.AB_NEG);
                matches.put(BloodType.A_POS, a_Neg_Donors);

                // 

                return matches;
            }
        }
        
        
        // Eligible Blood Type Recipients associated with each blood type
        public class EligibleRecipientBloodTypes {
            // Create a Map to associate each blood type with matching donor blood types
            private final Map<BloodType, List<BloodType>> eligibleRecipientBloodTypes;

            public EligibleRecipientBloodTypes() {
                // Constructor
                eligibleRecipientBloodTypes = createEligibleRecipientBloodTypes();
            }

            public Map<BloodType, List<BloodType>> getEligibleRecipientBloodTypes() {
                return eligibleRecipientBloodTypes;
            }

            // Method to create the map of matching Recipient blood types
            // Which blood types can this blood type receive blood from
            private Map<BloodType, List<BloodType>> createEligibleRecipientBloodTypes() {
                Map<BloodType, List<BloodType>> matches = new HashMap<>();

                // Blood Type A+
                List<BloodType> a_Pos_Recipients = new ArrayList<>();
                a_Pos_Recipients.add(BloodType.A_POS);
                a_Pos_Recipients.add(BloodType.A_NEG);
                a_Pos_Recipients.add(BloodType.O_POS);
                a_Pos_Recipients.add(BloodType.O_NEG);
                matches.put(BloodType.A_POS, a_Pos_Recipients);

                // Blood Type A-
                List<BloodType> a_Neg_Recipients = new ArrayList<>();
                a_Neg_Recipients.add(BloodType.A_NEG);
                a_Neg_Recipients.add(BloodType.O_NEG);
                matches.put(BloodType.A_POS, a_Neg_Recipients);

                // 

                return matches;
            }
        }
        
        private String value;
        private BloodType(String value){
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
                System.out.println("HLAType already in patient's HLA List");
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
//        return this;
//        return this;
//        return this;
//        return this;
//        return this;
//        return this;
//        return this;
//        return this;
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
