/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributionRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ruchachotalia
 */
public class DistributionOrganization extends Organization {
    public ArrayList<PersonOrganization> personDirectory;
    
    public ArrayList<VaccineCount> vaccineDirectory;

    public ArrayList<VaccineCount> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<VaccineCount> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public ArrayList<PersonOrganization> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<PersonOrganization> personDirectory) {
        this.personDirectory = personDirectory;
    }
    public DistributionOrganization() {
        super(Type.Distribution.getValue());
        this.personDirectory = new ArrayList<PersonOrganization>();
        this.vaccineDirectory = new ArrayList<VaccineCount>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributionRole());
        return roles;
    }
}
