package com.company;

public class Nomadoil implements Benz{
    public  Nomadoil (int velocity){
        System.out.println("Nomadoil with number "+velocity+"filled");
    }

    @Override
    public String getBag(){
        return "Nomadoil Benz";
    }
    @Override
    public String toString(){
        return "Nomadoil benz";
    }
}
