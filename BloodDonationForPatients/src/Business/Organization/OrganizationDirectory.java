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
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SystemCoordinator.getValue())){
            organization = new SystemCoordinatorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MedicalTechnician.getValue())){
            organization = new MedicalTechnicianOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createLegalOrganization(Organization.LegalType legalType, String realName){
        Organization organization = null;
        if (legalType.getValue().equals(Organization.LegalType.LegalOfficer.getValue())){
            organization = new LegalOfficerOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization createBoneMarrowOrganization(Organization.BoneMarrowBankType bmBankType, String realName){
        Organization organization = null;
        if (bmBankType.getValue().equals(Organization.BoneMarrowBankType.BoneMarrowBank.getValue())){
            organization = new Bone_Marrow_Bank_Organization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createCancerCentreOrganization(Organization.BloodCancerCentreType cancerType, String realName){
        Organization organization = null;
        if (cancerType.getValue().equals(Organization.BloodCancerCentreType.BloodCancerCentre.getValue())){
            organization = new Leukemia_Centre_Organization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
      public Organization createGovernmentOrganization(Organization.GovernmentType govtType, String realName){
        Organization organization = null;
        if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
            organization = new GovernmentOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
}
