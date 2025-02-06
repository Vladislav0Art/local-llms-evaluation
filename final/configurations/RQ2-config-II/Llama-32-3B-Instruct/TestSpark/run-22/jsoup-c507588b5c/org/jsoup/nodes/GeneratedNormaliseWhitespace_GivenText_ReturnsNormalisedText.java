package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNormaliseWhitespace_GivenText_ReturnsNormalisedText {

    @Test
    public void normaliseWhitespace_GivenText_ReturnsNormalisedText() {
        String text = "   Hello World  ";
        String normalisedText = TextNode.normaliseWhitespace(text);
        assertEquals("Hello World", normalisedText);
    }

}