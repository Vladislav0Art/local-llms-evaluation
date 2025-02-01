package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb.deleteCharAt(sb.length() - 1);
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}