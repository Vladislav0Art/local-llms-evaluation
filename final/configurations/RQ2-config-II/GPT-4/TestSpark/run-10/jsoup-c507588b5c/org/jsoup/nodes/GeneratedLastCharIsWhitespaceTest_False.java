package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest_False {

    @Test
    public void lastCharIsWhitespaceTest_False() {
        StringBuilder sb = new StringBuilder("Hello, World!");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}