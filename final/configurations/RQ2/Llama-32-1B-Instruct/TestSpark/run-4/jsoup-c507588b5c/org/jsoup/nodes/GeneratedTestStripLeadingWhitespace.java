package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   ";
        StringBuilder builder = new StringBuilder();
        assertTrue(lastCharIsWhitespace(builder, " "));
        assertTrue(lastCharIsWhitespace(builder, "\n"));
        assertTrue(lastCharIsWhitespace(builder, "\t"));
        assertTrue(lastCharIsWhitespace(builder, "\r"));
    }

}