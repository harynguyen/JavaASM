package exercise.exercise3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Please enter string 2: ");
        String str2 = sc.nextLine();
        result = str1.compareTo(str2);
        if(result > 0) {
            System.out.print("String " + str1 + " > " + " String " + str2);
        }
        else if(result == 0) {
            System.out.print("String " + str1 + " = "  + " String " + str2);
        }
        else {
            System.out.print("String " + str1 + " < " + " String " + str2);
        }
    }
}
