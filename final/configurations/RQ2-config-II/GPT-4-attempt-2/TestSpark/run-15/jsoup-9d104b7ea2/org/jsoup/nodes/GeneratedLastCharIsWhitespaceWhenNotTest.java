package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceWhenNotTest {

    @Test
    public void lastCharIsWhitespaceWhenNotTest() {
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("NoWhitespace")));
    }

}