/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requests;

import Business.BloodTypes.BloodInventory;
import Business.BloodTypes.BloodTransaction;
import Business.BloodTypes.PersonBloodTypes;
import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author balumullamuri
 */
public class DonorRequestDirectory {
    EcoSystem system;
    private ArrayList<DonorRequest> donorRequestList;

    public ArrayList<DonorRequest> getDonorRequestList() {return donorRequestList;}
    public void setDonorRequestList(ArrayList<DonorRequest> donorRequestList) {this.donorRequestList = donorRequestList;}
    
    public DonorRequestDirectory(EcoSystem system){
        this.system = system;
        donorRequestList = new ArrayList<DonorRequest>();
    }
    
    public DonorRequest addDonorRequest(DonorRequest donorRequest)
    {
        donorRequestList.add(donorRequest);
        return donorRequest;
    }
    public DonorRequest removeDonorRequest(DonorRequest donorReq)
    {
        //DonorRequest donorRequest = new DonorRequest();
        //this.donor = donor
        donorRequestList.remove(donorReq);
        //return donorRequest;
        return null;
    }
    
    public EcoSystem getEcoSystem(){
        return system;
    }
    
    public void registerDonorApplicationForInventory(PersonBloodTypes.BloodType bloodType, DonorRequest request) {
        BloodInventory inventory = system.getInventory();
        inventory.addTransaction(bloodType, 1, BloodTransaction.TransactionType.In, request);
    }
    
}
