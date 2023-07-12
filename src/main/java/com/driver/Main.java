package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
       // obj.var;
        // Error 'var' has private access in RWOnly.java
        int oldvalue = obj.getVar();
        System.out.println(oldvalue);
        int updated = obj.setVar(50);
        System.out.println(updated);
    }
}