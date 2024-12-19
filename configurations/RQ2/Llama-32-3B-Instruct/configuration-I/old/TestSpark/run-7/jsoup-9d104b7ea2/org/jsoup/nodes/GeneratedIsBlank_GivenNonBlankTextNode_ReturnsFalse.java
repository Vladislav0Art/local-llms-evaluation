package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedIsBlank_GivenNonBlankTextNode_ReturnsFalse {

    private static final String TEST_TEXT = "Hello World";
    private static final int OFFSET = 7;
    private static final String NORMALISED_TEXT = "Hello World";

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode(TEST_TEXT);
        assertFalse(textNode.isBlank());
    }

}