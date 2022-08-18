package com.lec19;

public abstract class Emp implements Payable {
    private String fname, lname, ssnb;

    public Emp(String fname, String lname, String ssnb) {
        this.fname = fname;
        this.lname = lname;
        this.ssnb = ssnb;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSsnb() {
        return ssnb;
    }

    public void setSsnb(String ssnb) {
        this.ssnb = ssnb;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", ssnb='" + ssnb + '\'' +
                '}';
    }

    public abstract double earning();
}
