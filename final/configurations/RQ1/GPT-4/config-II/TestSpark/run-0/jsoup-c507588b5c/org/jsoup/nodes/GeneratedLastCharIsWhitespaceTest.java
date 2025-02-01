package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Test String ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder("Test String");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}