package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String text = "   ";
        String normalized = normaliseWhitespace(text);
        assertEquals("", normalized);
        normalized = stripLeadingWhitespace(normalized);
        assertEquals(" ", normalized);
    }

}