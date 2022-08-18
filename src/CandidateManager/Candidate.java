package CandidateManager;

import java.io.Serializable;
import java.util.Date;

public class Candidate implements Serializable {
    private String ID;
    private String name;
    private double math;
    private double phy;
    private double chemis;
    private Boolean gender;
    private String major;
    private Date bday;

    public Candidate(String ID, String name, double math, double phy, double chemis, Boolean gender,String bday) {
        this.ID = ID;
        this.name = name;
        this.math = math;
        this.phy = phy;
        this.chemis = chemis;
        this.gender = gender;
        this.major = "IT";
        this.bday = XUtil.convertStringToDate(bday);
        //convert String to Date
    }
    //All getters and setters

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhy() {
        return phy;
    }

    public void setPhy(double phy) {
        this.phy = phy;
    }

    public double getChemis() {
        return chemis;
    }

    public void setChemis(double chemis) {
        this.chemis = chemis;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }
}
