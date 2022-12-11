/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PersonOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PersonRole.PersonWorkAreaJPanel;

/**
 *
 * @author abhis
 */
public class PersonRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PersonWorkAreaJPanel(userProcessContainer, account, (PersonOrganization)organization, enterprise, business);
    }
    
}
