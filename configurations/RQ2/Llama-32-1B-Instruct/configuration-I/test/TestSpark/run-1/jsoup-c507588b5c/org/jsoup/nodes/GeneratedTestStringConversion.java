package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestStringConversion {

    @Test
    public void testStringConversion() {
        String text1 = "Hello";
        String text2 = "World!";

        assertEquals("Hello <b>World</b>", convertText(text1, text2));
    }

    private String convertText(String text1, String text2) {
        return "<p>" + text1 + "</p>" + "<b>" + text2 + "</b>";
    }

}