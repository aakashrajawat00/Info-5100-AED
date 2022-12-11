/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author ruchachotalia
 */
public class appointment extends WorkRequest{
    private String testResult;
    private String Date;
    private String hospitalName;
    private UserAccount person;
    private UserAccount lab;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserAccount getLab() {
        return lab;
    }

    public void setLab(UserAccount lab) {
        this.lab = lab;
    }

    public UserAccount getPerson() {
        return person;
    }

    public void setPerson(UserAccount person) {
        this.person = person;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    @Override
    public String toString(){
        return person.getUsername();
    }
}
