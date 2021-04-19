package bsu.rfe.java.group8.Buben.var12B;

import java.util.ArrayList;

public class User {
   // private ArrayList<User> UserInfo = new ArrayList<>(10);
    private String name;
    private String addres;

    public User (String name, String addres) {
        this.name = name;
        this.addres = addres;
    }
    public String getName() {
        return name;
    }
   // public ArrayList<User> getUsers() { return UserInfo; }
    public String getAddres(){
        return addres;
    }
}
