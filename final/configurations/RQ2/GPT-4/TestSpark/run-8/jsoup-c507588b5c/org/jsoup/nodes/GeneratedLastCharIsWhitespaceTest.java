package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean whitespace = TextNode.lastCharIsWhitespace(new StringBuilder("WhiteSpace "));
        assertTrue(whitespace);

        whitespace = TextNode.lastCharIsWhitespace(new StringBuilder("NoWhiteSpace"));
        assertFalse(whitespace);
    }

}