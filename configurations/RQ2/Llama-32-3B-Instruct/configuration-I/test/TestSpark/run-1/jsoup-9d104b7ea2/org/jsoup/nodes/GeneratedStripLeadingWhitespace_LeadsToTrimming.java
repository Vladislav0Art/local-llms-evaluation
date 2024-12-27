package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedStripLeadingWhitespace_LeadsToTrimming {

    @Test
    public void stripLeadingWhitespace_LeadsToTrimming() {
        String originalText = "   a ";
        String expectedText = "a";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(originalText));
    }

}