/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author maka
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private long contact;
    private String email;
    private String zipcode;

    public ArrayList<Organization.Type> supportedOrgTypes;
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Laboratory("Laboratory"),
        LocalClinic("LocalClinic"),
        Logistics("Logistics"),
        Headquarter("Headquarter"),
        Government("Government");

        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name, null);
        this.enterpriseType = type;
        this.supportedOrgTypes = new ArrayList<Organization.Type>();
        organizationDirectory = new OrganizationDirectory();
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void addOrganizationType(Organization.Type organizationType){
        supportedOrgTypes.add(organizationType);
    }
    
    public ArrayList<Organization.Type> getSupportedOrganizationTypes(){
        return supportedOrgTypes;
    }
}
