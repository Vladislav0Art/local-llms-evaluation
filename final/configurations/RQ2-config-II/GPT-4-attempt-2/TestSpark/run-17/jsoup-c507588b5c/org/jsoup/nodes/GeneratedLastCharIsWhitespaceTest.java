package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("test text "));
        assertTrue(result);

        result = TextNode.lastCharIsWhitespace(new StringBuilder("test text"));
        assertFalse(result);
    }

}