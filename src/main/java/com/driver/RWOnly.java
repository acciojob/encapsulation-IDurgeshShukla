package com.driver;

public class RWOnly {
    private int var = 10;
    public int getVar(){
        return var;
    }
    public int setVar(int val){
        this.var = val;
        return val;
    }
}
