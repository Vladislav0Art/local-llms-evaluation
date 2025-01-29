package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello   World!  ";
        assertEquals("   Hello   World!", normaliseWhitespace(text));
    }

}