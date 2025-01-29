package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedMethod5 {

    @Test
    public void method5() {
        String name = "John";
        String[] result = getFull Name(name);
        assertEquals(result[0], "J");
        assertEquals(result[1], "o");
        assertEquals(result[2], "h");
        assertEquals(result[3], "n");
        assertEquals(result[4], " ");
    }

    public static String[] getFull

    Name(String name) {
        return new String[]{name.charAt(0), ' ', name.charAt(1)};
    }

}