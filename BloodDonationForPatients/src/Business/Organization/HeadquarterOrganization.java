/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CaseManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saiku
 */
public class HeadquarterOrganization extends Organization {
     public HeadquarterOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.Headquarter.getValue() : name, parent);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaseManagerRole());
        return roles;
    }
    
}
