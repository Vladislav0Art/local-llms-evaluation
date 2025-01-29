package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestNormaliseTrailingWhitespace {

    @Test
    public void testNormaliseTrailingWhitespace() {
        String input = "Hello   ,   world!";
        String expected = "Hello, world!";
        assertEquals(expected, normaliseWhitespace(input));
    }

}