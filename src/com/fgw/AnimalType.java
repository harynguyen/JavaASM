package com.fgw;

public enum AnimalType {
    DOG("this is a dog", 4),
    PARROT("this is a parrot", 2),
    SPIDER("this is a spider", 8);

    private final String DESCRIPT;
    private final int NUMLEGS;

    private AnimalType(String d, int n){
        this.DESCRIPT = d;
        this.NUMLEGS = n;
    }

    public  String getDESCRIPT() {return DESCRIPT;}
    public int getNUMLEGS() {return NUMLEGS;}

}
