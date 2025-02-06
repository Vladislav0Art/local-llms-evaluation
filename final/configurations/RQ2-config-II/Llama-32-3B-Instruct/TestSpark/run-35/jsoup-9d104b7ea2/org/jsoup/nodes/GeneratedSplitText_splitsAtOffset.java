package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_splitsAtOffset {

    @Test
    public void splitText_splitsAtOffset() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        int offset = 7;
        TextNode firstPart = node.splitText(offset);
        assertEquals(6, firstPart.text().length());
        assertEquals("World!", firstPart.text());
    }

}