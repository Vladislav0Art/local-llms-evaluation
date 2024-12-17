package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedConstructor Test {

    @Test
    public void constructor

    Test() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

}