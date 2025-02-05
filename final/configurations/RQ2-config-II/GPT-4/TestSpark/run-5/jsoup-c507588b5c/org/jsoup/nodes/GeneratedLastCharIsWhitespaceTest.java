package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder("test");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}