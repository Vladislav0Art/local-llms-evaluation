package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestNormaliseSingleSpace {

    @Test
    public void testNormaliseSingleSpace() {
        String input = "Hello   !";
        String expected = "Hello !";
        assertEquals(expected, normaliseWhitespace(input));
    }

}