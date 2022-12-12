/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author ruchachotalia
 */
public class VaccineDirectory {
    private ArrayList<Vaccine> vaccineDirectory;
    
    public VaccineDirectory(){
        this.vaccineDirectory = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<Vaccine> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }
    
    public Vaccine addVaccine(Vaccine vaccine){
        this.vaccineDirectory.add(vaccine);
        return vaccine;
    }
    
    public void updateVaccine(Vaccine vaccine){
        int index = vaccineDirectory.indexOf(vaccine);
        vaccineDirectory.set(index, vaccine);
    }
    
    public void deleteVaccine(Vaccine vaccine){
        vaccineDirectory.remove(vaccine);
    }
}
