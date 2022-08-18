package lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter pattern: ");
            String pString = sc.nextLine();

            System.out.print("Enter string: ");
            String testString = sc.nextLine();

            Pattern pattern = Pattern.compile(pString);
            Matcher matcher = pattern.matcher(testString);

            boolean status = false;
            while(matcher.find()) {
                System.out.println("I found the text '" + matcher.group()+ "' " + "start at " + matcher.start() + ",end at " +matcher.end());
                status = true;
            }
            if(!status) {
                System.out.println("No match found");
            }
        }
    }
}
