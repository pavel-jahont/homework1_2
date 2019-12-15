package com.gmail.jahont.pavel;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Randoms;

public class GenerateMassiveOfTenNumbers {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void generateListOfTenNumbersAndImplement(short valueByMod, short sizeOfArray) {
        byte max_index = 0;
        byte min_index = 0;
        short min = valueByMod;
        short max = (short) -valueByMod;
        List<Short> randomArrayList = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            randomArrayList.add((short) new Randoms().getRandomNumberInRangeByMod(valueByMod));
            if (min > randomArrayList.get(i)) {
                min = randomArrayList.get(i);
                min_index = (byte) i;
            }
            if (max < randomArrayList.get(i)) {
                max = randomArrayList.get(i);
                max_index = (byte) i;
            }
        }
        logger.info("Max value: " + max);
        logger.info("Min value: " + min);
        randomArrayList.set(max_index, min);
        randomArrayList.set(min_index, (short) (max * min));
        logger.error("Modified massive: " + randomArrayList.toString());
    }

    public void generateMassiveOfTenNumbersAndImplement(short number, short sizeOfArray) {
        byte max_index = 0;
        byte min_index = 0;
        int[] massiveOfRandomNumbers = new int[sizeOfArray];
        int min = number;
        int max = -number;
        for (int i = 0; i < massiveOfRandomNumbers.length; i++) {
            massiveOfRandomNumbers[i] = new Randoms().getRandomNumberInRangeByMod(number);
            if (min > massiveOfRandomNumbers[i]) {
                min = massiveOfRandomNumbers[i];
                min_index = (byte) i;
            }
            if (max < massiveOfRandomNumbers[i]) {
                max = massiveOfRandomNumbers[i];
                max_index = (byte) i;
            }
        }
        logger.info("Max value: " + max);
        logger.info("Min value: " + min);
        massiveOfRandomNumbers[max_index] = min;
        massiveOfRandomNumbers[min_index] = min * max;
        logger.error("Modified massive: " + Arrays.toString(massiveOfRandomNumbers));
    }
}
