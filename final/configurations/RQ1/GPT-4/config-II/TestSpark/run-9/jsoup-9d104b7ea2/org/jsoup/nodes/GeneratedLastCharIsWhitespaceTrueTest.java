package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        boolean output = TextNode.lastCharIsWhitespace(new StringBuilder("Hello "));

        assertTrue(output);
    }

}