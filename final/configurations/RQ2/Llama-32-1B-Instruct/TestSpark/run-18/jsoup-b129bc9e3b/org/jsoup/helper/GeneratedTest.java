package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public String method1() {
        return "Hello, World!";
    }

    public int method2(int[] array) {
        return array.length;
    }

    public String[] method3(String message) {
        String[] words = message.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString().split(" ");
    }

    @Test
    public void method1() {
        String result = "Hello, World!";
        assertEquals(result, "Hello, World!");
    }

    @Test
    public void method2() {
        int[] array = {1, 2, 3};
        int result = getArrayLength(array);
        assertEquals(3, result);
    }

    public static int getArrayLength(int[] array) {
        return array.length;
    }

    @Test
    public void method3() {
        String message = "Hello, World!";
        String[] result = message.split(" ");
        assertEquals(result.length, 2);
    }

    @Test
    public void method4() {
        int result = (int) Math.pow(2, 10);
        assertEquals(1024, result);
    }

}