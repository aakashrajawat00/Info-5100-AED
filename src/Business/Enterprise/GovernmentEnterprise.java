/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashrajawat
 */
public class GovernmentEnterprise extends Enterprise {
    public GovernmentEnterprise(String name, Network network){
        super(name,EnterpriseType.Government, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
