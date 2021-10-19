package com.company;

public interface ElementsOfCar {
    enum Velocity {slow, middle, far }

    void push();

    void fillBenz(Benz  benz);

    void brake();
}
