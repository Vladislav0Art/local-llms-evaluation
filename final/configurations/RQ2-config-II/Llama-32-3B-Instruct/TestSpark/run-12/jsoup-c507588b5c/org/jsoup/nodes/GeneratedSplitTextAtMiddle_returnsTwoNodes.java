package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextAtMiddle_returnsTwoNodes {

    @Test
    public void splitTextAtMiddle_returnsTwoNodes() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 6;
        TextNode[] nodes = textNode.splitText(offset);
        assertEquals(2, nodes.length);
        assertEquals("World", nodes[0].text());
        assertEquals("Hello", nodes[1].text());
    }

}