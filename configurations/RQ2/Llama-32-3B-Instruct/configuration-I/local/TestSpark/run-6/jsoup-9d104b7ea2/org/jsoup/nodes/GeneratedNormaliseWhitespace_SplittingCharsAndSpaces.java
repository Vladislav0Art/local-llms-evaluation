package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_SplittingCharsAndSpaces {

    @Test
    public void normaliseWhitespace_SplittingCharsAndSpaces() {
        String text = "   Hello, World!  ";
        String expectedText = "Hello, World!";
        String actualText = TextNode.normaliseWhitespace(text);
        assertEquals(expectedText, actualText);
    }

}