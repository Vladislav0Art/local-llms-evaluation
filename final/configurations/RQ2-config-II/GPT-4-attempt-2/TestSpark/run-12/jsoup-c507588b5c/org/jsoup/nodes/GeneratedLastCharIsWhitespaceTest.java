package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("abc ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder("abc");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}