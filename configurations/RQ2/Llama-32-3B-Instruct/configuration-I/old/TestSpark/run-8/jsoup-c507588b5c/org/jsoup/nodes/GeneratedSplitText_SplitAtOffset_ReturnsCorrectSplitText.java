package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitText_SplitAtOffset_ReturnsCorrectSplitText {

    @Test
    public void splitText_SplitAtOffset_ReturnsCorrectSplitText() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

}