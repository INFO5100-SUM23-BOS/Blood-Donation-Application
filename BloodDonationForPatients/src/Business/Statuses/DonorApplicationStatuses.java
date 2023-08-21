/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Statuses;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author maka
 */
public class DonorApplicationStatuses {
    
public enum RequestStatus {
        Submitted("Submitted"),
        Pending("Pending"),
        AddedToInventory("Added to inventory"),
        Closed("Closed"),
        Declined("Declined"),
        Finalized("Finalized");
        
        private String value;

        private RequestStatus(String value) {
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
    
    ArrayList<RequestStatus> statusList;
    
    public DonorApplicationStatuses(){
        statusList = new ArrayList<RequestStatus>(Arrays.asList(RequestStatus.values()));
    }
    
    public RequestStatus findDonorApplicationStatus(String status){
        for (RequestStatus rs : statusList){
            if (rs.getValue().equals(status)) return rs;
        }
        return null;
    }
    
    public ArrayList<RequestStatus> getDonorApplicationStatusList(){
        return statusList;
    }
}
