package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsNotWhitespaceTest {

    @Test
    public void lastCharIsNotWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Test"));
        assertFalse("Non Whitespace Last Character identified as Whitespace", result);
    }

}