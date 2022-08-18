package com.lecture3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static boolean validVowel(String str) {
        Pattern pattern = Pattern.compile("[aeiuo]",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()) return true;
        return false;
    }
    public static String removeVowel(String str) {
        return str.replaceAll("(?i)[ieuoa]", "");
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        List<String> arr = Arrays.asList(str.split(" "));
//        for(String s : arr) {
//            if(validVowel(s)) System.out.println(removeVowel(s));
//        }
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Bobby");
        map.put(2, "Mandie");
        map.put(3, "Patrick");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
