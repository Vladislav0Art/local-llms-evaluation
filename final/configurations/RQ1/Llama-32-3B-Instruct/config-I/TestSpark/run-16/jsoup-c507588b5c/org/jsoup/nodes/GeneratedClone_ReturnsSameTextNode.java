package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedClone_ReturnsSameTextNode {

    @Test
    public void clone_ReturnsSameTextNode() {
        TextNode node = new TextNode("Hello World");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals("#text", cloned.nodeName());
        assertEquals("Hello World", cloned.text());
        assertEquals("Hello World", cloned.getWholeText());
    }

}