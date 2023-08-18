/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author balumullamuri
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(null != type) switch (type) {
            case Laboratory:
                enterprise=new LaboratoryEnterprise(name);
                break;
            case Logistics:
                enterprise=new LogisticsEnterprise(name);
                break;
            case Government:
                enterprise=new GovernmentEnterprise(name);
                break;
            case LocalClinic:
                enterprise=new LocalClinicEnterprise(name);
                break;
            case Headquarter:
                enterprise=new HeadquarterEnterprise(name);
                break;
            default:
        }
        if (enterprise != null) enterpriseList.add(enterprise);
        
        return enterprise;
    }
}
