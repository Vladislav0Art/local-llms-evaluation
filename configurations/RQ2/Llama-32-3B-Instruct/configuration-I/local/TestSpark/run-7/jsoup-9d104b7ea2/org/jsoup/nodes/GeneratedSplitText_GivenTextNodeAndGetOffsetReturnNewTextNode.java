package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedSplitText_GivenTextNodeAndGetOffsetReturnNewTextNode {

    private static final String TEST_TEXT = "Hello World";
    private static final int OFFSET = 7;
    private static final String NORMALISED_TEXT = "Hello World";

    @Test
    public void splitText_GivenTextNodeAndGetOffsetReturnNewTextNode() {
        TextNode textNode = new TextNode(TEST_TEXT);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(outContent);
        try {
            TextNode result = textNode.splitText(OFFSET);
            assertEquals(NORMALISED_TEXT.substring(0, OFFSET), result.text());
            assertEquals(NORMALISED_TEXT.substring(OFFSET), textNode.splitText(OFFSET + NORMALISED_TEXT.length()));
        } finally {
            System.setOut(originalOut);
        }
    }

}