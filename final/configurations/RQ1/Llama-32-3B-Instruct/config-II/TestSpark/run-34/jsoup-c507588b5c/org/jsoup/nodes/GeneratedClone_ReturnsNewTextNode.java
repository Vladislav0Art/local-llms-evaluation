package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedClone_ReturnsNewTextNode {

    @Test
    public void clone_ReturnsNewTextNode() {
        String text = "Hello";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.value(), clonedTextNode.text());
    }

}