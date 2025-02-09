package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedSplitTextZeroOffsetTest {

    @Test
    public void splitTextZeroOffsetTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode result = textNode.splitText(0);
        assertNotNull(result);
        assertEquals(textNode.text(), result.text());
    }

}