package com.company;

public class NomadoilResource  implements Resource {
    @Override
    public ElementsOfCar createCar(ElementsOfCar.Velocity velocity){
        return  new Mercedes(velocity);
    }

    @Override
    public  Benz createBenz(int velocity){
        return  new Sinoil(velocity);
    }
}
