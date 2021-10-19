package com.company;

public class Main {
    private Resource factory;
    public Main(Resource resource){
        factory= resource;
    }
    public ElementsOfCar createProg(ElementsOfCar.Velocity velocity, int kmoverhour){
        ElementsOfCar elementsOfCar= factory.createCar(velocity);
        Benz benz= factory.createBenz(kmoverhour);
        elementsOfCar.fillBenz(benz);
        return  elementsOfCar;
    }
    public static void main(String[] args){
        Main client =new Main(new NomadoilResource());
        ElementsOfCar e1 =client.createProg(ElementsOfCar.Velocity.far, 300);
        e1.push();
        e1.brake();
    }
}
