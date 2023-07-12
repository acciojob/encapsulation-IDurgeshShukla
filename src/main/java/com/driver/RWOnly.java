package com.driver;

public class RWOnly {
    private String name = "Mohan";
    public String getName(){
        return name;
    }
    public String setName(String n){
        this.name = n;
        return name;
    }
}
