package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceWhenIsTest {

    @Test
    public void lastCharIsWhitespaceWhenIsTest() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("Whitespace ")));
    }

}