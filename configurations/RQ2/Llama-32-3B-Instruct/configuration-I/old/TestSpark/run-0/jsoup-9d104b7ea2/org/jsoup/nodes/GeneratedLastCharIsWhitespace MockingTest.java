package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedLastCharIsWhitespace MockingTest {

    @Test
    public void lastCharIsWhitespace

    MockingTest() {
        StringBuilder sb = new StringBuilder();
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}