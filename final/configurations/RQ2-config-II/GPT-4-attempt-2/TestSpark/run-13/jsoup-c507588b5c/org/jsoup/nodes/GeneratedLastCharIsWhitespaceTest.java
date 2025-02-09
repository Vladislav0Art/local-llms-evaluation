package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder textWithWhitespaceAtEnd = new StringBuilder("Test text ");
        assertTrue(TextNode.lastCharIsWhitespace(textWithWhitespaceAtEnd));

        StringBuilder textWithoutWhitespaceAtEnd = new StringBuilder("Test text");
        assertFalse(TextNode.lastCharIsWhitespace(textWithoutWhitespaceAtEnd));
    }

}