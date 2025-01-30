package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {


    // Test for normaliseWhitespace()

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("This is a text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}