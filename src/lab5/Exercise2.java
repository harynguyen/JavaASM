package lab5;

import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        Pattern pattern = Pattern.compile("(^[a-z]|([ ] [a-z]))");
        Matcher matcher = pattern.matcher(name);
        String newName = matcher.replaceAll(x -> x.group().toUpperCase());

        StringBuilder mySyntax1 = new StringBuilder();
        int length = newName.length();
        int lastSpace = newName.lastIndexOf(" ");
        for (int i = 0; i < length; i++) {
            if(Character.isUpperCase(newName.charAt(i))|| i > lastSpace + 1) {
                mySyntax1.append(newName.charAt(i));
            }
        }
        System.out.println(mySyntax1);
    }
}
