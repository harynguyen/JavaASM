package com.lec16;

public class BasicEmp extends CommissionEmp {
    private double baseSalary;
    public BasicEmp(String fname, String lname, String ssnb, double grossSale, double commisRate, double baseSalary) {
        super(fname, lname, ssnb, grossSale, commisRate);
        setBaseSalary(baseSalary);

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary > 0.0)
            this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("Base Salary must be greater than 0.0");
    }
    public String toString() {
        return String.format("%s - %.2f", super.toString(), this.getBaseSalary());
    }
}
