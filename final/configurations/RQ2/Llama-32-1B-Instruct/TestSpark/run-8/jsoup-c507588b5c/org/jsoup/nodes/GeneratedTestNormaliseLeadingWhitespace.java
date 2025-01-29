package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestNormaliseLeadingWhitespace {

    @Test
    public void testNormaliseLeadingWhitespace() {
        String input = "  Hello,  world!   ";
        String expected = "Hello, world!";
        assertEquals(expected, normaliseWhitespace(input));
    }

}