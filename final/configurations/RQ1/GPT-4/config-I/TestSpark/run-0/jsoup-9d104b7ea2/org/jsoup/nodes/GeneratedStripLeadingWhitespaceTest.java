package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {


    // Test for normaliseWhitespace()

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "    This is     a text     ";
        assertEquals("This is     a text     ", TextNode.stripLeadingWhitespace(text));
    }

}