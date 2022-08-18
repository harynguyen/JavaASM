package com.fgw;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ranking = sc.nextInt();

        switch (ranking) {
            case 10, 9, 8 -> System.out.print("Master");
            case 7, 6 -> System.out.print("Journeyman");
            default -> System.out.print("Invalid Data");
        }
    }
}
