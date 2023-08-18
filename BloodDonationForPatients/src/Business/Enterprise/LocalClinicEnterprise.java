/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author balumullamuri
 */
public class LocalClinicEnterprise extends Enterprise {
    
    public LocalClinicEnterprise(String name){
        super(name,EnterpriseType.LocalClinic);
        this.addOrganizationType(Type.LocalClinic);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
