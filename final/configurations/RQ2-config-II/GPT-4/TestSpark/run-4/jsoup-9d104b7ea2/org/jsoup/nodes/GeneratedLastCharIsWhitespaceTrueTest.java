package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        boolean isLastWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("testing "));
        assertTrue(isLastWhitespace);
    }

}