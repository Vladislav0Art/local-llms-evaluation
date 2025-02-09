package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = "  strip leading whitespace";
        String stripedText = TextNode.stripLeadingWhitespace(textWithLeadingWhitespace);
        assertEquals("strip leading whitespace", stripedText);
    }

}