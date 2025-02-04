package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedSplitTextNodeAtOffsetReturnsCorrectSibling {

    @Test
    public void splitTextNodeAtOffsetReturnsCorrectSibling() {
        TextNode textNode = new TextNode("Hello World!");
        int offset = 6;
        String expectedOutput = "World!";
        TextNode sibling = textNode.splitText(offset);
        assertEquals(expectedOutput, sibling.text());
    }

}