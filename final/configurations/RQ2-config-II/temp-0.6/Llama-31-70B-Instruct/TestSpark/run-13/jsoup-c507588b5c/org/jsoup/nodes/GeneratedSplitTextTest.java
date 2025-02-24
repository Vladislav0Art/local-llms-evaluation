package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello world!");
        TextNode newNode = textNode.splitText(6);
        assertEquals("Hello ", textNode.text());
        assertEquals("world!", newNode.text());
    }

}