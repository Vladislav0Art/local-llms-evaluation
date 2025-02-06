package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNewNodeText_ReturnsCorrectTextNode {

    @Test
    public void newNodeText_ReturnsCorrectTextNode() {
        Document doc = new Document();
        TextNode node = doc.newTextNode("Hello World");
        assertNotNull(node);
        assertEquals("text", node.nodeName());
        assertEquals("Hello World", node.text());
        assertTrue(!node.isBlank());
    }

}