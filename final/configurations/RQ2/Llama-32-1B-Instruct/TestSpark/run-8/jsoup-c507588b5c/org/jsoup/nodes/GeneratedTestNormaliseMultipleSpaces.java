package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestNormaliseMultipleSpaces {

    @Test
    public void testNormaliseMultipleSpaces() {
        String input = "   Hello  world! ";
        String expected = "Hello world!";
        assertEquals(expected, normaliseWhitespace(input));
    }

}