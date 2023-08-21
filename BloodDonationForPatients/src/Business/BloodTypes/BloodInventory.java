/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodTypes;

import Business.BloodTypes.BloodTransaction.TransactionType;
import Business.BloodTypes.PersonBloodTypes.BloodType;
import Business.EcoSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author maka
 */
public class BloodInventory {

    EcoSystem system;
    ArrayList<BloodTransaction> ledger;
    HashMap<BloodType, Integer> balance;

    public BloodInventory(EcoSystem system) {
        this.system = system;
        ledger = new ArrayList<BloodTransaction>();
        balance = new HashMap<BloodType, Integer>();
        for (BloodType bt: Arrays.asList(PersonBloodTypes.BloodType.values())) {
            balance.put(bt, 0);
        }
    }

    public void addTransaction(BloodType bloodType, int units, TransactionType inOut, Object reference) {
        if (doesReferenceExist(reference)) return;
        BloodTransaction newTransaction = new BloodTransaction(bloodType, units, inOut, reference);
        ledger.add(newTransaction);
        
        int currentBalance = balance.getOrDefault(bloodType, 0);
        int newBalance = currentBalance + ((inOut == TransactionType.In) ?  units : (-1)*units);
        balance.put(bloodType, newBalance);
    }
    
    public boolean doesReferenceExist(Object reference){
        for (BloodTransaction bt: ledger){
            if (bt.getReference().equals(reference)) return true;
        }
        return false;
    }
    
    public Integer getBloodTypeBalance(BloodType bloodType){
        return balance.getOrDefault(bloodType, 0);
    }
    
    public HashMap<BloodType, Integer> getInventoryBalance(){
        return balance;
    }
    
    public BloodTransaction findLastTransactions(BloodType bloodType){
        BloodTransaction lastOne = null;
        for (BloodTransaction bt : ledger){
            if (bt.getBloodType().equals(bloodType)) lastOne = bt;
        }
        return lastOne;
    }

}
