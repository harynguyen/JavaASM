package exercise.exercise4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float bim;
        System.out.print("Please enter your weight: ");
        float weight = sc.nextFloat();
        System.out.print("Please enter your height: ");
        float height = sc.nextFloat();
        bim = weight / (height * height);

        if (bim < 18.5) {
            System.out.print(" You underweight");
        } else if (18.5 < bim && bim > 25) {
            System.out.print("You normal");
        }
        else if(25 < bim && bim < 30){
            System.out.print("You Overweight");
        }
        else {
            System.out.print("You Obese");
        }
    }
}
