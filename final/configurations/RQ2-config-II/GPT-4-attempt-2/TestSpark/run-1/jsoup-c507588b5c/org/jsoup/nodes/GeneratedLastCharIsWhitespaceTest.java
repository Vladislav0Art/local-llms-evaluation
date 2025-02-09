package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder stringBuilder = new StringBuilder("test string ");
        assertTrue(TextNode.lastCharIsWhitespace(stringBuilder));

        stringBuilder = new StringBuilder("test string");
        assertFalse(TextNode.lastCharIsWhitespace(stringBuilder));
    }

}