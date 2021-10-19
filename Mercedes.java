package com.company;

public class Mercedes implements ElementsOfCar{
    public Mercedes(Velocity velocity){
        System.out.println("Mercedes filled the benz with "+velocity);
    }

    @Override
    public void push(){
        System.out.println("Mercedes pushed a gaz");
    }

    @Override
    public void fillBenz(Benz benz){
        System.out.println("Mercedes fill benz : "+benz);
    }

    @Override
    public void brake(){
        System.out.println("Mercedes braked a gaz");
    }
}
