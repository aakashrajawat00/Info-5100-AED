/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author ruchachotalia
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Person.getValue())){
            organization = new PersonOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Pharma.getValue())){
            organization = new PharmaOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Manufacturing.getValue())){
            organization = new ManufacturingOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Sales.getValue())){
            organization = new SalesOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Purchase.getValue())){
            organization = new PurchaseOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Health.getValue())){
            organization = new HealthOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Economy.getValue())){
            organization = new EconomyOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Distribution.getValue())){
            organization = new DistributionOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}