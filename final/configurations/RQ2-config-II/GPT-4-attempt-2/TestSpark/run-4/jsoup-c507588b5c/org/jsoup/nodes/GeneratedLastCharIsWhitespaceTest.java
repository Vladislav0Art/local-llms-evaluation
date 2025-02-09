package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("test text "));
        assertTrue(isWhitespace);

        isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("test text"));
        assertFalse(isWhitespace);
    }

}