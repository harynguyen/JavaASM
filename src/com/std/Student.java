package com.std;

public class Student {
        private String name, email; //instance variables

        public Student(String name2,String email2){
            name = name2;
            email = email2;
        }
        public void setName(String name1){
            name = name1;
        }
        public void setEmail(String email1) {
            email = email1;
        }
        public String getName() {
            return name;
        }
        public String getEmail() {
            return email;
        }

}
