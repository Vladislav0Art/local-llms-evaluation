package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsNotWhitespaceTest {

    @Test
    public void lastCharIsNotWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}