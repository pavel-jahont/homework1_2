package com.gmail.jahont.pavel;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) throws Exception {
        chooseServise(1);
    }

    public static void chooseServise(int value) throws Exception {
        if (value == 1) {
            GenerateThreeNumbers gtn = new GenerateThreeNumbers();
            gtn.generateThreeNumbersAndImplement();
        } else if (value == 2) {
            GenerateMassiveOfTenNumbers gmtn = new GenerateMassiveOfTenNumbers();
            gmtn.generateListOfTenNumbersAndImplement((short) 300, (short) 10);
        } else if (value == 3) {
            GenerateTenObjects gto = new GenerateTenObjects();
            gto.generateTenObjectsAndImplement(10);
        } else {
            logger.error("Servise with number " + value + " doesn't exist!");
            throw new RuntimeException();
        }
    }
}
