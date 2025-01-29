package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestMethod2 {

    public String method1() {
        return "Hello, World!";
    }

    public int method2(int[] array) {
        return array.length;
    }

    public String method3(String message) {
        return message.split(" ");
    }

    @Test
    public void testMethod2() {
        assertEquals(5, method2(new int[]{}));
    }

}