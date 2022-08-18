package com.lec16;

import com.lec19.Emp;

public class CommissionEmp extends Emp {
    private Double grossSale, commisRate;

    public CommissionEmp(String fname, String lname, String ssnb, Double grossSale, Double commisRate) {
        super(fname, lname, ssnb);
        setCommisRate(commisRate);
        setGrossSale(grossSale);
    }

    public Double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(Double grossSale) {
        this.grossSale = (grossSale < 0.0) ? 0.0 : grossSale;
    }

    public Double getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(Double commisRate) {
        this.commisRate = (commisRate > 0.0 && commisRate < 1.0) ? commisRate : 0.0;
    }

    @Override
    public String toString() {
        return "CommissionEmp{" +
                "fname='" + super.getFname() +
                ", lname='" + super.getLname() +
                ", ssnb='" + super.getSsnb() +
                ", grossSale=" + grossSale +
                ", commisRate=" + commisRate +
                '}';
    }
    public double earning(){
        return this.commisRate*this.grossSale;
    }
    public double getPayment(){return this.earning();}
}

