package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public int getOptimalArrayLength(String arrayLength) {
        if (arrayLength.isEmpty()) return -1;

        String[] split = arrayLength.split(" ");
        String firstNumber = split[0].trim();
        String secondNumber = split[1].trim();

        for (int i = 2; i < firstNumber.length(); i++) {
            if (firstNumber.charAt(i) == ' ') break;
        }

        return Integer.parseInt(firstNumber.substring(0, i)) + Integer.parseInt(secondNumber);
    }

    public int calculateArrayLength(String arrayLength) {
        if (arrayLength.isEmpty()) return -1;

        String[] split = arrayLength.split(" ");
        String firstNumber = split[0].trim();
        String secondNumber = split[1].trim();

        for (int i = 2; i < firstNumber.length(); i++) {
            if (firstNumber.charAt(i) == ' ') break;
        }

        return Integer.parseInt(firstNumber.substring(0, i)) + Integer.parseInt(secondNumber);
    }

}