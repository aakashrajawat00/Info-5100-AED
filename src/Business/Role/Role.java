/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author vraj
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Distribution("Distribution - Service"),
        Doctor("Doctor - Hospital"),
        Economy("Economy - Government"),
        Health("Health Ministry - Government"),
        Lab("Lab - Hosptial"),
        Manufacturing("Manufacturing - Pharmaceutical"),
        Person("Person - Government"),
        Pharma("Pharma - Hospital"),
        Purchase("Purchase - Service"),
        Sales("Sales - Pharmaceutical");
        
        private String value;
        
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business);
    
//    public abstract JPanel createWorkArean(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }   
}