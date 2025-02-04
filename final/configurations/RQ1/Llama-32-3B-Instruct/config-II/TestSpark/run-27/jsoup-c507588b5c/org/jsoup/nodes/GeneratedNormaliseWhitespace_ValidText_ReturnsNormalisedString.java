package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_ValidText_ReturnsNormalisedString {

    @Test
    public void normaliseWhitespace_ValidText_ReturnsNormalisedString() {
        String text = "   Hello World  ";
        String expected = "Hello World";
        assertEquals(expected, StringUtil.normaliseWhitespace(text));
    }

}