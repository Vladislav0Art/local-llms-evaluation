package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextNodeTest {

    @Test
    public void splitTextNodeTest() throws IOException {
        String text = "Hello World";
        Document doc = new Document(text);
        TextNode textNode = doc.getNodes().get(0);
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertNotNull(tailNode);
        assertEquals("World", tailNode.text());
    }

}