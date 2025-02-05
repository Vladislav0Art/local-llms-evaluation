package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("example text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder("example text");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}