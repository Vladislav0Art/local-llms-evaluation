package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedClone_GivenTextNode_ReturnsClone {

    @Test
    public void clone_GivenTextNode_ReturnsClone() {
        Document document = new Document();
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();

        assertNotNull(clonedTextNode);
        assertEquals("text", clonedTextNode.nodeName());
        assertTrue(clonedTextNode.text().equals(textNode.text()));
    }

}