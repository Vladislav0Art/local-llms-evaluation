package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode splitNode = textNode.splitText(7);

        assertEquals("Hello, ", textNode.text());
        assertEquals("world!", splitNode.text());
    }

}