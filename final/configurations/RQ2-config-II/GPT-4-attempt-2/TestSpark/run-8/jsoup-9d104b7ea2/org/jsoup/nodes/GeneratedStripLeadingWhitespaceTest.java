package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "    Test text";
        String expected = "Test text";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

}