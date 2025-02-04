package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedSplitTextNodeAtOffsetThrowsWithInvalidOffset {

    @Test
    public void splitTextNodeAtOffsetThrowsWithInvalidOffset() {
        TextNode textNode = new TextNode("Hello World!");
        int offset = -1;
        assertTrue(Validate.isFalse(textNode.splitText(offset)));

        int offset2 = 11;
        assertTrue(Validate.isFalse(textNode.splitText(offset2)));
    }

}