package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedNormaliseWhitespace_GivenTextWithSpaces_ReturnsSpaceNormalisedString {

    private static final String TEST_TEXT = "Hello World";
    private static final int OFFSET = 7;
    private static final String NORMALISED_TEXT = "Hello World";

    @Test
    public void normaliseWhitespace_GivenTextWithSpaces_ReturnsSpaceNormalisedString() {
        String result = TextNode.normaliseWhitespace("Hello   World");
        assertEquals("Hello World", result);
    }

}