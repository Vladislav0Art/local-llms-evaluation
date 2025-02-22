package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("Hello,", textNode.text());
        assertEquals("World!", tailNode.text());
    }

}