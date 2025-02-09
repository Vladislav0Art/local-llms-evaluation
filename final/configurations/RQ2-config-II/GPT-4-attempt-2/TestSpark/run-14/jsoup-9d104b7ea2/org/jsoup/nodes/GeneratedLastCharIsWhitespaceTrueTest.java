package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder text = new StringBuilder("Test text ");
        assertTrue(TextNode.lastCharIsWhitespace(text));
    }

}