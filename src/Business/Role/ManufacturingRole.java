/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.ManufacturingOrganization;
import Business.UserAccount.UserAccount;
import ui.ManufacturingRole.ManufacturingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aakashrajawat
 */
public class ManufacturingRole extends Role{
    
    
//JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount account, Network network, ManufacturingOrganization organization, Enterprise enterprise

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new ManufacturingWorkAreaJPanel(userProcessContainer, account, (ManufacturingOrganization)organization, enterprise, business);
    }

}
