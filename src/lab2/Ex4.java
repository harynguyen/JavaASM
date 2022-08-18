package lab2;


import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] array  = new int[size];
//
//        for (int i = 0; i < size; i++){
//            array[i] = sc.nextInt();
//        }
//        System.out.println("-----------");
//        int[] newArray = new int[size];
//        int j = size - 1;
//        for(int i = 0; i < size; i++){
//            newArray[j] = array[i];
//            j--;
//        }
//        for(int i : newArray){
//            System.out.print("array: "+ i);
//        }String str = new String();
//        System.out.print("Please enter size of array: ");
////        int size = sc.nextInt();
////        String str = new String();
////        String[] array = new String[size];
////
////        for(int i = 0; i < size; i++){
////            array[i] = sc.nextLine();
////        }
////        System.out.println("-------------------");
////        for (String i : array) {
////            System.out.print("First string: \n" + i);
////        }
////        String[] newArray = new String[size];
////        int j = size - 1;
////
////        for(int i = 0; i < size; i++){
////            newArray[j] = array[i];
////            j--;
////        }
////        for (String i : newArray) {
////            System.out.print("Last string: " + i);
////        }
        String[] names = {"Harry", "Ron", "John"};
        int j = 0;
        String[] b = new String[names.length];
        for(int i = b.length - 1; i >= 0; i--){
            b[i] = names[j];
            j++;
        }
        for (String i : b) {
            System.out.print("Last string: " + i);
       }
    }
}
