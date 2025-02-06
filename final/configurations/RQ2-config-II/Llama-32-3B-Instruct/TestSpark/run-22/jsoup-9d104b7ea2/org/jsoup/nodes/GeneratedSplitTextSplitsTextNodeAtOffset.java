package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitTextSplitsTextNodeAtOffset {

    @Test
    public void splitTextSplitsTextNodeAtOffset() throws IOException {
        String text = "hello world";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int offset = 5;
        TextNode result = textNode.splitText(offset);
        assertTrue(result != null);
        assertEquals("world", result.text());
    }

}