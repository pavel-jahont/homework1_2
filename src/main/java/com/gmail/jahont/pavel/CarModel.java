package com.gmail.jahont.pavel;

import java.util.Random;

public enum CarModel {
    GLK("Glk"),
    MAYBACH("Maybach"),
    VIANO("Viano"),
    AVENSIS("Avensis"),
    CAMRY("Camry"),
    VENZA("Venza"),
    ACCORD("Accord"),
    CIVIC("Civic"),
    JAZZ("Jazz");

    private String car;

    CarModel(String car) {
        this.car = car;
    }

    public static CarModel getRandomCar() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String car() {
        return car;
    }

}
