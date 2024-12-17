package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   ";
        String expectedText = " ";
        assertEquals(expectedText, TextNode.normaliseWhitespace(text));
    }

}