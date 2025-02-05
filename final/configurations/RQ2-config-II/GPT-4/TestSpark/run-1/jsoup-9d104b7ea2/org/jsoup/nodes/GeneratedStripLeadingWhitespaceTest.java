package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "        example text";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        assertEquals("example text", strippedText);
    }

}