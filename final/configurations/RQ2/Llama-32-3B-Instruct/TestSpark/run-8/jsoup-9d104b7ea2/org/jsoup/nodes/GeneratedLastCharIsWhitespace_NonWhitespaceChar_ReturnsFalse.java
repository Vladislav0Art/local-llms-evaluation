package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedLastCharIsWhitespace_NonWhitespaceChar_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_NonWhitespaceChar_ReturnsFalse() {
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("Hello")));
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder(" ")));
    }

}