package com.lec19;

public class SalariedEmp extends Emp implements Comparable<SalariedEmp> {

    private double weeklySalary;
    public SalariedEmp(String fname, String lname, String ssnb, double weeklySalary) {
        super(fname, lname, ssnb);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earning() {
        return this.weeklySalary;
    }

    @Override
    public double getPayment() {
        return this.earning();
    }

    @Override
    public String toString() {
        return "SalariedEmp{" +
                "fname='" + super.getFname() +
                ", lname='" + super.getLname() +
                ", ssnb='" + super.getSsnb() +
                ", weeklySalary=" + weeklySalary +
                '}';
    }

    @Override
    public int compareTo(SalariedEmp o) {
        return this.getFname().compareTo(o.getFname());//-1; 0; 1
    }
}
