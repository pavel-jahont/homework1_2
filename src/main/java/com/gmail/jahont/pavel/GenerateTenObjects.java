package com.gmail.jahont.pavel;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Randoms;

public class GenerateTenObjects {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private static final Randoms randoms = new Randoms();
    private String name = "Name";

    public void generateTenObjectsAndImplement(int objCount) throws Exception {
        List<Car> carList = new ArrayList<>();
        List<Car> listCarCapacity1 = new ArrayList<>();
        List<Car> listCarCapacity2 = new ArrayList<>();
        List<Car> listCarCapacity3 = new ArrayList<>();
        for (int i = 0; i < objCount; i++) {
            Car car = new Car(name + i, CarModel.getRandomCar(), randoms.getRandomNumber());
            carList.add(car);
            if (carList.get(i).getEngineCapacity() == 1) {
                listCarCapacity1.add(car);
            }
            if (carList.get(i).getEngineCapacity() == 2) {
                listCarCapacity2.add(car);
            }
            if (carList.get(i).getEngineCapacity() == 3) {
                listCarCapacity3.add(car);
            }
        }
        Map<Integer, List<Car>> map = new HashMap<>();
        map.put(1, listCarCapacity1);
        map.put(2, listCarCapacity2);
        map.put(3, listCarCapacity3);
    }

}