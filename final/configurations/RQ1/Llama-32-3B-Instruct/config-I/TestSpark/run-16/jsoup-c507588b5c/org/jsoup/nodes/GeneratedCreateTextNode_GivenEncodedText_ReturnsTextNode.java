package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedCreateTextNode_GivenEncodedText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "&lt;Hello&gt; World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("#text", node.nodeName());
        assertEquals("Hello World", node.text());
        assertEquals("Hello World", node.getWholeText());
        assertTrue(node.isBlank());
    }

}