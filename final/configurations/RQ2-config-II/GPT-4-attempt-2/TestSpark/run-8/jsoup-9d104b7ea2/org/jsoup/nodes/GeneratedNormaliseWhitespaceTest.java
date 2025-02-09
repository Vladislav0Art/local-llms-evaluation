package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "Test    text";
        String expected = "Test text";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

}