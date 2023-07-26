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
public class Blood_Centre_Enterprise extends Enterprise {
    
    public Blood_Centre_Enterprise(String name){
        super(name,EnterpriseType.WorldCordBloodCenter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
