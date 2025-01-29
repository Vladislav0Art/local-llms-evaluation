package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestMethod1 {

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
    public void testMethod1() {
        assertEquals(method1(), "Hello, World!");
    }

}