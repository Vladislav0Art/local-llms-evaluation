package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Hello, ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb = new StringBuilder("Hello, World!");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}