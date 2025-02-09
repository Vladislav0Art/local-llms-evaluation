package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("trailing space "));
        assertTrue(result);
    }

}