package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedNormaliseWhitespace_LeadingSpace_ReturnsStringWithSpace {

    @Test
    public void normaliseWhitespace_LeadingSpace_ReturnsStringWithSpace() {
        String originalText = "  a ";
        String expectedText = " a ";
        assertEquals(expectedText, TextNode.normaliseWhitespace(originalText));
    }

}