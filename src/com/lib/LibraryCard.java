package com.lib;

import com.fgw.Owner;

public class LibraryCard {
    private Owner owner;

    public void setOwner(Owner o){owner = o;}
//    public Student getOwner(){return owner;}
//
//    public void checkOwner(Student b){
//        String ownerName = owner.getName();
//        if(b.getName().equals(ownerName)){
//            System.out.print(b.getName() + " owner");
//        }
//        else{
//            System.out.print(b.getName() + " not");
//        }
//    }
//    public void changeEmailOwner (String email, String newEmail){
//        String ownerEmail = owner.getEmail();
//        if(email.equals(ownerEmail)){
//            owner.setEmail(newEmail);
//            System.out.print("Change email successfully");
//        }
//        else{
//            System.out.print("Invalid email");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("check students");
//        System.out.println("change email");
////        System.out.println("Enter your choice: ");
////        int n = sc.nextInt();
//
//
////        switch(n){
//
//        Student s1 = new Student("Ngoan", "ngoan@gmail.com");
//        Student s2 = new Student("Tuyen", "tuyen@gmail.com");
//
//        LibraryCard l1 = new LibraryCard();
//        LibraryCard l2 = new LibraryCard();
//
//        l1.setOwner(s1);
//        l2.setOwner(s1);
//
//        l2.checkOwner(s1);
//
//
//        Student s3 = new Student("Ngoan", "ngoan@gmail.com");
//        Student s4 = new Student("Tuyen", "tuyen@gmail.com");
//
//        LibraryCard l3 = new LibraryCard();
//        LibraryCard l4 = new LibraryCard();
//
//        l3.setOwner(s3);
//        l4.setOwner(s3);
//
//        l4.changeEmailOwner("ngoan@gmail.com", "ngoankhung@gmail.com");
//        System.out.print(l4.getOwner().getEmail());
    public boolean checkOwner (Owner o) {
//        if(this.owner.getName().equals(o.getName()))
//            return true;
//        return false;
        return this.owner.getName().equals(o.getName());
    }
}