/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author ruchachotalia
 */
public class vaccinate extends WorkRequest{
    private String testResult;
    private String Date;
    private Date dt;

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }
    private String vaccineName;
    private int gap;
    private String distributionCenter;
    private UserAccount health;

    public UserAccount getHealth() {
        return health;
    }

    public void setHealth(UserAccount health) {
        this.health = health;
    }

    public String getDistributionCenter() {
        return distributionCenter;
    }

    public void setDistributionCenter(String distributionCenter) {
        this.distributionCenter = distributionCenter;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getPerson() {
        return person;
    }

    public void setPerson(UserAccount person) {
        this.person = person;
    }
    private UserAccount person;
    
    @Override
    public String toString(){
        return person.getUsername();
    }
}
