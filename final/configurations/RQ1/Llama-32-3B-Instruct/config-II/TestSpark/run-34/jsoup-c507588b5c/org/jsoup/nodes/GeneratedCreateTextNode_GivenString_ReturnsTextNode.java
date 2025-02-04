package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedCreateTextNode_GivenString_ReturnsTextNode {

    @Test
    public void createTextNode_GivenString_ReturnsTextNode() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.value());
    }

}