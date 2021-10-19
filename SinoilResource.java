package com.company;

public class SinoilResource implements Resource {
    @Override
    public ElementsOfCar createCar(ElementsOfCar.Velocity velocity){
        return  new BMW(velocity);
    }

    @Override
    public  Benz createBenz(int velocity){
        return  new Nomadoil(velocity);
    }
}
