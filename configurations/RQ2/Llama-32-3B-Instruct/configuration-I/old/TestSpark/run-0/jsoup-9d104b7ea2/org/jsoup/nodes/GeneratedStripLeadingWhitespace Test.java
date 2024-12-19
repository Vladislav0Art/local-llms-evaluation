package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedStripLeadingWhitespace Test {

    @Test
    public void stripLeadingWhitespace

    Test() {
        String text = "   Hello   ";
        String stripped = TextNode.stripLeadingWhitespace(text);
        assertEquals("Hello   ", stripped);
    }

}