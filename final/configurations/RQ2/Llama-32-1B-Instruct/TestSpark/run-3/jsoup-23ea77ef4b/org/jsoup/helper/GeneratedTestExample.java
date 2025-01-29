package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestExample {

    @Test
    public void testExample() {
        String input1 = "3 5";
        int output1 = Solution.getOptimalArrayLength(input1);
        String result1 = "2";

        int actual1 = Solution.calculateArrayLength("3 5");
        assertEquals(output1, actual1);

        String input2 = "4 10";
        int output2 = Solution.getOptimalArrayLength(input2);
        String result2 = "3";

        int actual2 = Solution.calculateArrayLength("4 10");
        assertEquals(output2, actual2);
    }

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

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }

}