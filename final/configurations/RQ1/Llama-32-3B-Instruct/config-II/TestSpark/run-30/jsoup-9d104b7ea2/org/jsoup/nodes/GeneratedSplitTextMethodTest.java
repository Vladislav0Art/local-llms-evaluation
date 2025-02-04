package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextMethodTest {

    @Test
    public void splitTextMethodTest() {
        String originalText = "Hello World\n";
        int offset = 6;

        TextNode textNode = new TextNode(originalText);
        TextNode tailNode = textNode.splitText(offset);

        assertEquals(originalText.substring(0, offset), textNode.text());
        assertEquals("World", tailNode.text());
    }

}