/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HLA;

import java.util.ArrayList;

/**
 *
 * @author balumullamuri
 */
public class PersonHLA {
    private ArrayList<HLAType> hlaList = new ArrayList();
    
    public PersonHLA() {
        hlaList = new ArrayList<>();
    }
    
    public enum HLAType{
        HLA_A("HLA_A"),
        HLA_B("HLA_B"),
        HLA_C("HLA_C"),
        HLA_DR("HLA_DR"),
        HLA_DBQ1("HLA_DBQ1"),
        A_POS("A+"),
        A_NEG("A-"),
        B_POS("B+"),
        B_NEG("B-"),
        AB_POS("AB+"),
        AB_NEG("AB-"),
        O_POS("O+"),
        O_NEG("O-");
        
        private String value;
        private HLAType(String value){
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

    public ArrayList<HLAType> getHlaList() {
        return hlaList;
    }
    
    public ArrayList<String> getHlaValuesList() {
        ArrayList<String> hlaValuesList = new ArrayList<String>();
        for(HLAType h : this.hlaList) {
            hlaValuesList.add(h.getValue());
        }
        
        return hlaValuesList;
    }

    public void setHlaList(ArrayList<HLAType> hlaList) {
        this.hlaList = hlaList;
    }
    
    public void addHLA(HLAType hlaType) {
        
        for(HLAType t : this.getHlaList()) {
            if(t.getValue().equals(hlaType.getValue())) {
                System.out.println("HLAType already in patient's HLA List");
                return;
            }
        }
        
        this.getHlaList().add(hlaType);
    }
    
    public void updateHLAlist(String hlaList) {
        this.hlaList = new ArrayList<HLAType>();
        try {
            for(String hlaType: hlaList.split(",")) {
                this.hlaList.add(HLAType.valueOf(hlaType.trim()));
            }
        }
        catch (Exception e){
            System.out.println(e);
            this.hlaList.add(HLAType.valueOf(hlaList));
        }
//        return this;
    }
    
    public void removeHLA(HLAType hlaType) {
//        for(HLAType t : this.hla.getHlaList()) {
//            if(t.getValue().equals(hlaType.getValue())) {
//                System.out.println("HLAType already in patient's HLA List");
//                return;
//            }
//        }
        this.getHlaList().remove(hlaType);
    }
    
    public static PersonHLA createHLA(String hlaList) {
        PersonHLA pHLA = new PersonHLA();
        pHLA.updateHLAlist(hlaList);
        return pHLA;
    }
    
}
