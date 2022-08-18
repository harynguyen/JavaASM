package com.fgw;

import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        //case 1:
        for(AnimalType type : AnimalType.values()) {
            System.out.println(type);
        }
        //case 2:
        System.out.println("----------------------------");
        for(AnimalType type :EnumSet.range(AnimalType.PARROT, AnimalType.SPIDER)) {
            System.out.println(type + " " + type.getDESCRIPT() + " " + type.getNUMLEGS());
        }

        // case 3:
        try {
            System.out.println("=============================");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            AnimalType name = AnimalType.valueOf(str);

            System.out.println(name.getDESCRIPT());
            System.out.println(name.getNUMLEGS());
        } catch (Exception e){
            System.out.println("Something wrong!");
            System.out.println("=============================");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            AnimalType name = AnimalType.valueOf(str);
            System.out.println(name.getDESCRIPT());
            System.out.println(name.getNUMLEGS());
        }
    }
}
