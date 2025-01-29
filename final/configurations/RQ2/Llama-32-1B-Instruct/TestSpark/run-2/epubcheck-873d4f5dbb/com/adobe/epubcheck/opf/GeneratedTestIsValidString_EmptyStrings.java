package com.adobe.epubcheck.opf;

import org.junit.Test;

public class GeneratedTestIsValidString_EmptyStrings {

    /**
     * Checks if a given string is valid.
     *
     * @param s The input string to check.
     * @return True if the string is not empty, false otherwise.
     */
    public static boolean isValidString(String s) {
        return !s.isEmpty();
    }

    /**
     * Calculates the sum of a given array of integers.
     *
     * @param numbers The array of integers to calculate the sum from.
     * @return The sum of the integers in the array.
     */
    public static int calculateSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new RuntimeException("Input array is empty");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Test
    public void testIsValidString_EmptyStrings() {
        assertFalse(TestUtils.isValidString(""));
    }
}

}