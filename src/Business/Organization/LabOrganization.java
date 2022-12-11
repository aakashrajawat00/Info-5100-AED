/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ruchachotalia
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabRole());
        return roles;
    }
     
   
    
    
}
