package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedSplitText_GivenOffset_ReturnsTextNode {

    @Test
    public void splitText_GivenOffset_ReturnsTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode tailNode = node.splitText(offset);
        assertNotNull(tailNode);
        assertEquals("#text", tailNode.nodeName());
        assertTrue(node.isBlank());
        assertEquals("Hello ", tailNode.text());
        assertEquals("Hello ", tailNode.getWholeText());
    }

}