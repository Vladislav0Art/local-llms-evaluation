package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedClone Test {

    @Test
    public void clone

    Test() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        TextNode cloned = textNode.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

}