package com.fgw;

public class BikecyleRegis {
    public static void main (String[] args){
        Owner ngoan = new Owner("Ngoan","Ngoan@gmail.com");


        Bikecycle bike = new Bikecycle();
        bike.setOwner(ngoan);
        System.out.println(ngoan.getEmail());
    }
}
