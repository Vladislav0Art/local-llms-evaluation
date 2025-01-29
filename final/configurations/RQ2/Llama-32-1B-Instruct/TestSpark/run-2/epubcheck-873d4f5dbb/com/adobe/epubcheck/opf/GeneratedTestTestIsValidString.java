package com.adobe.epubcheck.opf;

public class GeneratedTestTestIsValidString {

    public static boolean isValidString(String s) {
        return !s.isEmpty();
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class TestClass1 {

    @Test
    public void testTestIsValidString() {
        assertTrue(TestUtils.isValidString(""));
    }

}