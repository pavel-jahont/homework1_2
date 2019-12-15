package com.gmail.jahont.pavel;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Randoms;

public class GenerateThreeNumbers {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void generateThreeNumbersAndImplement() {
        short x = (short) new Randoms().getRandomNumber();
        short y = (short) new Randoms().getRandomNumber();
        short z = (short) new Randoms().getRandomNumber();
        if (x > z) {
            int sum = y + x;
            logger.debug("Amount X+Y: " + sum);
        } else {
            logger.debug("Value Z: " + z);
        }
        double sumThreeValues = x + y + z;
        logger.info("Average value of three numbers: " + sumThreeValues / 3);
    }

}
