/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author saiku
 */
public class OrganizationDirectory {
      private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type, String realName){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Government.getValue())){
            organization = new GovernmentOrganization(realName, this);
        } else if (type.getValue().equals(Organization.Type.Headquarter.getValue())){
            organization = new HeadquarterOrganization(realName, this);
        } else if (type.getValue().equals(Organization.Type.Laboratory.getValue())){
            organization = new LaboratoryOrganization(realName, this);
        } else if (type.getValue().equals(Organization.Type.LocalClinic.getValue())){
            organization = new LocalClinicOrganization(realName, this);
        } else if (type.getValue().equals(Organization.Type.Logistics.getValue())){
            organization = new LogisticsOrganization(realName, this);
        }
        organizationList.add(organization);
        return organization;
    }
}
