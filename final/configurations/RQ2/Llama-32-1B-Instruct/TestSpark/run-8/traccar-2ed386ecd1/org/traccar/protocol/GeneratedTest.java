package org.traccar.protocol;

public class GeneratedTest {

    public static int parseNumber(int number) {
        return Math.abs(number);
    }

    public static String decodeString(String string) {
        if (string.length() < 2) {
            throw new IllegalArgumentException("Invalid input: " + string);
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

}