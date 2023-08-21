/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requests;

import Business.BloodTypes.BloodInventory;
import Business.BloodTypes.BloodTransaction;
import Business.BloodTypes.PersonBloodTypes;
import Business.EcoSystem;
import Business.Requests.DonorRequest;
import java.util.ArrayList;

/**
 *
 * @author balumullamuri
 */
public class PatientRequestDirectory {

    EcoSystem system;
    private ArrayList<PatientRequest> patientRequestList;

    public ArrayList<PatientRequest> getPatientRequestList() {
        return patientRequestList;
    }

    public void setPatientRequestList(ArrayList<PatientRequest> patientRequestList) {
        this.patientRequestList = patientRequestList;
    }

    public PatientRequestDirectory(EcoSystem system) {
        patientRequestList = new ArrayList<PatientRequest>();
        this.system = system;
    }

    public void addPatientRequest(PatientRequest patientRequest) {
        patientRequestList.add(patientRequest);
    }

    public DonorRequest removePatientRequest(PatientRequest p) {
        patientRequestList.remove(p);
        return null;
    }

    public EcoSystem getEcoSystem() {
        return system;
    }

    public void registerBloodRequestForInventory(PersonBloodTypes.BloodType bloodType, PatientRequest request, int volume) {
        BloodInventory inventory = system.getInventory();
        inventory.addTransaction(bloodType, volume, BloodTransaction.TransactionType.Out, request);
    }
}
