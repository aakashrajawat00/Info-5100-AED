/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.EconomyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ruchachotalia
 */
public class EconomyOrganization extends Organization {
    public EconomyOrganization() {
        super(Type.Economy.getValue());
    }
    
    private VaccineDirectory directory = new VaccineDirectory();

    public VaccineDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(VaccineDirectory directory) {
        this.directory = directory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EconomyRole());
        return roles;
    }
}
