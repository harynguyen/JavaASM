package com.fgw;

import java.util.Scanner;

public class ArrayInput {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array  = new int[size];

        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("-----------");
        for (int i : array){
            System.out.printf("%d ", i);
        }
    }
}
