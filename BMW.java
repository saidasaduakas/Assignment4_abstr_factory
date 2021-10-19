package com.company;

public class BMW implements ElementsOfCar{
    public BMW(Velocity velocity){
        System.out.println("BMW filled the benz with "+velocity);
    }

    @Override
    public void push(){
        System.out.println("BMW pushed a gaz");
    }

    @Override
    public void fillBenz(Benz benz){
        System.out.println("BMW fill benz : "+benz);
    }


    @Override
    public void brake(){
        System.out.println("BMW braked a gaz");
    }
}
