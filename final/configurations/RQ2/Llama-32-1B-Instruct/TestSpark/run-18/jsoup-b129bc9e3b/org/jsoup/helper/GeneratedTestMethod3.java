package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestMethod3 {

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
    public void testMethod3() {
        String[] result = method3("Hello, World!");
        assertEquals("H e l l o  W o r l d", result);
    }

}