package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("a ")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("a")));
    }

}