package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedStripLeadingWhitespace_leadingWhitespaceRemoved {

    @Test
    public void stripLeadingWhitespace_leadingWhitespaceRemoved() {
        String text = "   Hello World  ";
        String expected = "Hello World";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

}