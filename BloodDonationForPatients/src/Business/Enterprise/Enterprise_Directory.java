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
public class Enterprise_Directory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise_Directory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Legal){
            enterprise=new LegalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.HRSA){
            enterprise=new HRSA_Enterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.BloodDonationBank){
            enterprise=new Blood_Donation_Bank_Enterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.WorldCordBloodCenter){
            enterprise=new Blood_Centre_Enterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
