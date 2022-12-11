/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.Enterprise;

/**
 *
 * @author ruchachotalia
 */
public class PurchaseInventory {
    private int Qty;
    private Enterprise manuEP;

    public Enterprise getManuEP() {
        return manuEP;
    }

    public void setManuEP(Enterprise manuEP) {
        this.manuEP = manuEP;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }
    @Override
    public String toString(){
        return manuEP.getName();
    }
}
