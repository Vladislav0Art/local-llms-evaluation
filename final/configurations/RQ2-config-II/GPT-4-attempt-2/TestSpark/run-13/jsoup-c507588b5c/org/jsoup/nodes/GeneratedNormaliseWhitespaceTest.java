package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhiteSpaces = "Test     text";
        String normalisedText = TextNode.normaliseWhitespace(textWithWhiteSpaces);
        assertEquals("Test text", normalisedText);
    }

}