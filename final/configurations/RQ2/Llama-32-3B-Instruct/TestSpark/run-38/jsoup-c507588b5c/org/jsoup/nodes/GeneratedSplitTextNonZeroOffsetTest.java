package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedSplitTextNonZeroOffsetTest {

    @Test
    public void splitTextNonZeroOffsetTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode result = textNode.splitText(5);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

}