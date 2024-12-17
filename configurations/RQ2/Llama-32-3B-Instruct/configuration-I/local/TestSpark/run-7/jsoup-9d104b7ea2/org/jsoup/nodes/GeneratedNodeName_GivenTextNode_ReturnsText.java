package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedNodeName_GivenTextNode_ReturnsText {

    private static final String TEST_TEXT = "Hello World";
    private static final int OFFSET = 7;
    private static final String NORMALISED_TEXT = "Hello World";

    @Test
    public void nodeName_GivenTextNode_ReturnsText() {
        TextNode textNode = new TextNode(TEST_TEXT);
        assertEquals("text", textNode.nodeName());
    }

}