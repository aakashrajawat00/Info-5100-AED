/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author ruchachotalia
 */
public class Vaccine {
    private String Name;
    private String scientificName;
    private String manufacturerName;
    private String mgQty;
    private String Status;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private int noOfDoses;
    private int Gap;

    public int getGap() {
        return Gap;
    }

    public void setGap(int Gap) {
        this.Gap = Gap;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getMgQty() {
        return mgQty;
    }

    public void setMgQty(String mgQty) {
        this.mgQty = mgQty;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getNoOfDoses() {
        return noOfDoses;
    }

    public void setNoOfDoses(int noOfDoses) {
        this.noOfDoses = noOfDoses;
    }
    
    @Override
    public String toString(){
        return Name;
    }
}
