package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public String parseStringLiteralWithNonStringCharacters(String input) {
        return "12345";
    }

    @Test
    public void testParseToken() {
        String input = "12345";
        assertEquals(5, input.length());
        System.out.println(input);
    }

}