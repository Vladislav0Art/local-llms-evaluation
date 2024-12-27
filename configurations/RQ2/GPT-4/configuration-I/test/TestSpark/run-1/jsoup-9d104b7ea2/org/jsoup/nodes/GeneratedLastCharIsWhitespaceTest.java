package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Hello World "));
        assertTrue(result);
        result = TextNode.lastCharIsWhitespace(new StringBuilder("Hello World"));
        assertFalse(result);
    }

}