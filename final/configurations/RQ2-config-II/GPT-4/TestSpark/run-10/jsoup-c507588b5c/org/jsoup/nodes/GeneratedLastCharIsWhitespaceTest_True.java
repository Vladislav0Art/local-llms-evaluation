package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest_True {

    @Test
    public void lastCharIsWhitespaceTest_True() {
        StringBuilder sb = new StringBuilder("Hello, World! ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}