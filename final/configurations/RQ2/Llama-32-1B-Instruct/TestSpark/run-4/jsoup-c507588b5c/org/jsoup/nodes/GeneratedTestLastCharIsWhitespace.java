package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        assertTrue(lastCharIsWhitespace(sb, 'a'));
        assertTrue(lastCharIsWhitespace(sb, '\n'));
        assertTrue(lastCharIsWhitespace(sb, '\t'));
        assertTrue(lastCharIsWhitespace(sb, "\r"));
    }

}