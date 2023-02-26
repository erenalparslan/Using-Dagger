package com.erenalparslan.daggerjava;

import javax.inject.Inject;

public class Car {
    Engine engine;
    Wheels wheels;
@Inject
    public Car(Engine engine,Wheels wheels) {
        this.engine = engine;
        this.wheels=wheels;
    }
    public void drive(){};
}
