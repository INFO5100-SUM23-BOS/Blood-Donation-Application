/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.BloodTypes.BloodInventory;
import Business.BloodTypes.PersonBloodTypes;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.DonorDirectory;
import Business.Requests.DonorRequestDirectory;
import Business.People.PatientDirectory;
import Business.Requests.PatientRequestDirectory;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Statuses.BloodRequestStatuses;
import Business.Statuses.DonorApplicationStatuses;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author maka
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;

    private DonorDirectory donorDirectory;
    private PatientDirectory patientDirectory;
    private DonorRequestDirectory donorRequestDirectory;
    private PatientRequestDirectory patientRequestDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PersonBloodTypes personBloodTypes;
    private BloodRequestStatuses bloodRequestStatus;
    private DonorApplicationStatuses donorApplicationStatus;
    private BloodInventory inventory;
    

    private EcoSystem() {
        super("Worldcord", null);
        networkList = new ArrayList<Network>();
        this.donorDirectory = new DonorDirectory();
        this.patientDirectory = new PatientDirectory();
        this.donorRequestDirectory = new DonorRequestDirectory(this);
        this.patientRequestDirectory = new PatientRequestDirectory(this);
        this.userAccountDirectory = new UserAccountDirectory();
        this.bloodRequestStatus = new BloodRequestStatuses();
        this.donorApplicationStatus = new DonorApplicationStatuses();
        this.personBloodTypes = new PersonBloodTypes();
        this.inventory = new BloodInventory(this);
    }

    public UserAccountDirectory getUserAccountDirectory() {
        if (this.userAccountDirectory == null) {
            userAccountDirectory = new UserAccountDirectory();
            Employee employee = this.getEmployeeDirectory().createEmployee("sysadmin");
            UserAccount ua = this.userAccountDirectory.createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        }
        return this.userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public DonorRequestDirectory getDonorRequestDirectory() {
        if (this.donorRequestDirectory == null) {
            this.donorRequestDirectory = new DonorRequestDirectory(this);
        }
        return donorRequestDirectory;
    }

    public void setDonorRequestDirectory(DonorRequestDirectory donorRequestDirectory) {
        this.donorRequestDirectory = donorRequestDirectory;
    }

    public PatientRequestDirectory getPatientRequestDirectory() {
        if (this.patientRequestDirectory == null) {
            this.patientRequestDirectory = new PatientRequestDirectory(this);
        }
        return patientRequestDirectory;
    }

    public void setPatientRequestDirectory(PatientRequestDirectory patientRequestDirectory) {
        this.patientRequestDirectory = patientRequestDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        if (this.patientDirectory == null) {
            this.patientDirectory = new PatientDirectory();
        }
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DonorDirectory getDonorDirectory() {
        if (this.donorDirectory == null) {
            this.donorDirectory = new DonorDirectory();
        }
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public void setBloodRequestStatus(BloodRequestStatuses bloodRequestStatus) {
        this.bloodRequestStatus = bloodRequestStatus;
    }

    public BloodRequestStatuses getBloodRequestStatus() {
        return bloodRequestStatus;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public PersonBloodTypes getPersonBloodTypes(){
        return personBloodTypes;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }
    
    public DonorApplicationStatuses getDonorApplicationStatus(){
        return donorApplicationStatus;
    }
    
    public BloodInventory getInventory(){
        return inventory;
    }
}
