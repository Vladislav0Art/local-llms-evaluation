package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedText = TextNode.stripLeadingWhitespace("   Test text");
        assertEquals("Test text", strippedText);
    }

}