package utils;

import java.lang.invoke.MethodHandles;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Randoms {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public int getRandomNumber() {
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    public int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            logger.error("Max must be greater than min", new IllegalArgumentException());
            throw new IllegalArgumentException("Max must be greater than min");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public int getRandomNumberInRangeByMod(int number) {
        int min = -number;
        int max = number;
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
