package lab2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        System.out.println();
    }
}
