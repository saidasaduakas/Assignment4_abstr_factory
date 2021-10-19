package com.company;

public class Sinoil implements Benz{
    public  Sinoil (int velocity){
        System.out.println("Sinoil with number "+velocity+"filled");
    }

    @Override
    public String getBag(){
        return "Sinoil Benz";
    }
    @Override
    public String toString(){
        return "Sinoil benz";
    }
}
