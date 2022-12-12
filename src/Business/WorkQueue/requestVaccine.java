/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.PurchaseInventory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ruchachotalia
 */
public class requestVaccine extends WorkRequest{
    
    private String testResult;
    private UserAccount purchaser;
    private UserAccount distribution;
    private UserAccount sales;

    public UserAccount getSales() {
        return sales;
    }

    public void setSales(UserAccount sales) {
        this.sales = sales;
    }

    public UserAccount getDistribution() {
        return distribution;
    }

    public void setDistribution(UserAccount distribution) {
        this.distribution = distribution;
    }
    private ArrayList<PurchaseInventory> inventoryPurchase;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public requestVaccine(){
        super();
        this.inventoryPurchase= new ArrayList<>();
    }

    public ArrayList<PurchaseInventory> getInventoryPurchase() {
        return inventoryPurchase;
    }

    public void setInventoryPurchase(ArrayList<PurchaseInventory> inventoryPurchase) {
        this.inventoryPurchase = inventoryPurchase;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    private int qty;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(UserAccount purchaser) {
        this.purchaser = purchaser;
    }
    @Override
    public String toString(){
        return purchaser.getUsername();
    }
}
