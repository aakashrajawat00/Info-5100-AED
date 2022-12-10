 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author aakashrajawat
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    
    public enum EnterpriseType{
        Hospital("Hospital") , Service("Service") , Pharmaceutical("Pharmaceutical") , Government("Government");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type, Network network){
        super(name);
        this.enterpriseType=type;
        this.network = network;
        organizationDirectory=new OrganizationDirectory();
    }
}
