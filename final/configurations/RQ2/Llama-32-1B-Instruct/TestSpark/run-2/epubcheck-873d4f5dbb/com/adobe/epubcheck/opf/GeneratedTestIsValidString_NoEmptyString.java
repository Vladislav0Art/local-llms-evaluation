package com.adobe.epubcheck.opf;

import org.junit.Test;

public class GeneratedTestIsValidString_NoEmptyString {

    public static String isValidString(String s) {
        return !s.isEmpty();
    }

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
    public void testIsValidString_NoEmptyString() {
        assertTrue(TestUtils.isValidString(""));
    }

}