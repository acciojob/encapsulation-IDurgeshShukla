package com.driver;

public class Main {
    public static void main (String[] args) {
        RWOnly obj = new RWOnly();
        obj.name;
        // Error 'var' has private access in RWOnly.java
        obj.setName("Shivam");
        String updated= obj.getName();
        System.out.println(updated);
    }
}