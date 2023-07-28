/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author balumullamuri
 */
public class HLACount {
    HashMap<String, Integer> HLAComboCounts;
    
    public HLACount() {
        HLAComboCounts = new HashMap<>();
    }
    
    public void HLACountAdd(PersonBloodType hla) {
        ArrayList<String> hlaValues = hla.getBloodTypeValuesList();
        Collections.sort(hlaValues);
        String hlaCombo = String.join(", ", hlaValues);
        this.HLAComboCounts.putIfAbsent(hlaCombo, 0);
        this.HLAComboCounts.put(hlaCombo, this.HLAComboCounts.get(hlaCombo) + 1);
    }
    
    public void HLACountAdd(PersonBloodType hla, Integer i) {
        ArrayList<String> hlaValues = hla.getBloodTypeValuesList();
        Collections.sort(hlaValues);
        String hlaCombo = String.join(", ", hlaValues);
        this.HLAComboCounts.putIfAbsent(hlaCombo, 0);
        this.HLAComboCounts.put(hlaCombo, this.HLAComboCounts.get(hlaCombo) + i);
    }
    
    public void HLACountSubstract(PersonBloodType hla) {
        ArrayList<String> hlaValues = hla.getBloodTypeValuesList();
        Collections.sort(hlaValues);
        String hlaCombo = String.join(", ", hlaValues);
//        this.HLAComboCounts.putIfAbsent(hlaCombo, 0);
        this.HLAComboCounts.put(hlaCombo, this.HLAComboCounts.get(hlaCombo) - 1);
    }
    
    public HashMap<String, Integer> getHlaComboCounts() {
        return HLAComboCounts;
    }
    
}
