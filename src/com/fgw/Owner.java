package com.fgw;

public class Owner {
    private String name, email; //instance variables

    public Owner(String n1,String e1){
        name = n1;
        email = e1;
    }
    public void setName(String n){
        name = n;
    }
    public void setEmail(String m) {
        email = m;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }


}
