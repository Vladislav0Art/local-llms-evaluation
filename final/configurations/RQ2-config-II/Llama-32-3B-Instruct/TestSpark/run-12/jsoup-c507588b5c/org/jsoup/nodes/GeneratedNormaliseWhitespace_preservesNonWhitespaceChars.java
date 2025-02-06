package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedNormaliseWhitespace_preservesNonWhitespaceChars {

    @Test
    public void normaliseWhitespace_preservesNonWhitespaceChars() {
        String text = "   Hello   World  ";
        String expected = "Hello World";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

}