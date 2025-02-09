package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithWhiteSpaces = "   Test text";
        String stripedText = TextNode.stripLeadingWhitespace(textWithWhiteSpaces);
        assertEquals("Test text", stripedText);
    }

}