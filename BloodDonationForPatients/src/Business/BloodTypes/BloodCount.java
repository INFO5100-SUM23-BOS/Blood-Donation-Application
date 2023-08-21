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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BloodCount {
    HashMap<String, Integer> bloodTypeComboCounts;

    public BloodCount() {
        bloodTypeComboCounts = new HashMap<>();
    }

    public void bloodTypeComboCountAdd(PersonBloodTypes bloodType) {
        ArrayList<String> bloodTypeValues = bloodType.getBloodTypeValuesList();
        Collections.sort(bloodTypeValues);
        String bloodTypeCombo = String.join(", ", bloodTypeValues);
        bloodTypeComboCounts.putIfAbsent(bloodTypeCombo, 0);
        bloodTypeComboCounts.put(bloodTypeCombo, bloodTypeComboCounts.get(bloodTypeCombo) + 1);
    }

    public void bloodTypeComboCountAdd(PersonBloodTypes bloodType, Integer i) {
        ArrayList<String> bloodTypeValues = bloodType.getBloodTypeValuesList();
        Collections.sort(bloodTypeValues);
        String bloodTypeCombo = String.join(", ", bloodTypeValues);
        bloodTypeComboCounts.putIfAbsent(bloodTypeCombo, 0);
        bloodTypeComboCounts.put(bloodTypeCombo, bloodTypeComboCounts.get(bloodTypeCombo) + i);
    }

    public void bloodTypeComboCountSubtract(PersonBloodTypes bloodType) {
        ArrayList<String> bloodTypeValues = bloodType.getBloodTypeValuesList();
        Collections.sort(bloodTypeValues);
        String bloodTypeCombo = String.join(", ", bloodTypeValues);
        bloodTypeComboCounts.put(bloodTypeCombo, bloodTypeComboCounts.get(bloodTypeCombo) - 1);
    }

    public HashMap<String, Integer> getBloodTypeComboCounts() {
        return bloodTypeComboCounts;
    }
}
