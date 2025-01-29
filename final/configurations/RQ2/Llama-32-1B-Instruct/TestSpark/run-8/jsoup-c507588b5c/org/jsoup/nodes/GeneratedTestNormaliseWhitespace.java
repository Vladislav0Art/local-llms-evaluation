package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String input = "   Hello, world!   ";
        String expected = "Hello, world!";
        assertEquals(expected, normaliseWhitespace(input));
    }

}