package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsNotWhitespaceTest {

    @Test
    public void lastCharIsNotWhitespaceTest() {
        StringBuilder sb = new StringBuilder().append("No Whitespace at end");

        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}