package com.gmail.jahont.pavel;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Randoms;

public class Car {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private static final Randoms randoms = new Randoms();

    private String name;
    private CarModel carModel;
    private int engineCapacity;

    public Car(String name, CarModel carModel, int engineCapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineCapacity = engineCapacity;
        if (1 > engineCapacity || engineCapacity > 3) {
            logger.error(name + " : " + carModel.car() + " : " + engineCapacity);
        }
    }

    public String getName() {
        return name;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}


