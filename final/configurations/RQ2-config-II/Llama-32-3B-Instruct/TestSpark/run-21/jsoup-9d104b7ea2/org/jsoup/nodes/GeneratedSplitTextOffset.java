package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitTextOffset {

    @Test
    public void splitTextOffset() throws IOException {
        String text = "Hello\nWorld!";
        TextNode textNode = new TextNode(text);
        int offset = 7;
        TextNode splitTextNode = textNode.splitText(offset);
        assertNotNull(splitTextNode);
        assertEquals(text, splitTextNode.text());
    }

}