package lab5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String[] wwords = str.split(" ");

        StringBuilder strB = new StringBuilder();

        for (int i = 0; i < wwords.length; i++) {
            if(strB.indexOf(wwords[i]) < 0)
                strB.append(wwords[i]).append(" ");
        }
        System.out.println(strB.toString().trim());
    }
}
