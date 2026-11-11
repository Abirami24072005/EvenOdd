
package com.example.evenodd;

import java.util.logging.Logger;

public class EvenOdd {

    private static final Logger LOGGER =
            Logger.getLogger(EvenOdd.class.getName());

    public static String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }

    public static void main(String[] args) {

        int number = 10;

        LOGGER.info("Number: " + number);
        LOGGER.info(checkNumber(number));
    }
}
