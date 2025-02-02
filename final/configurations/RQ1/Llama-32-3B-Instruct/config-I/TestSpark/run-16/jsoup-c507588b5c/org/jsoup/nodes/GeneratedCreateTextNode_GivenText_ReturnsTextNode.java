package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals("#text", node.nodeName());
        assertEquals(text, node.text());
        assertEquals(text, node.getWholeText());
        assertTrue(node.isBlank());
    }

}