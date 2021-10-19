package com.company;

public interface Resource {
    ElementsOfCar createCar(ElementsOfCar.Velocity velocity);

    Benz createBenz(int velocity);
}
