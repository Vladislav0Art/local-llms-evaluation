package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("test ")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("test")));
    }

}