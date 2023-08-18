/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabEmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author saiku
 */
public class LaboratoryOrganization extends Organization{
        public LaboratoryOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.Laboratory.getValue() : name, parent);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabEmployeeRole());
        return roles;
    }
     
    
}
