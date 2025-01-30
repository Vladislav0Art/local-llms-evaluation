package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Hello, world");
        TextNode newNode = node.splitText(7);
        assertEquals("Hello, ", node.getWholeText());
        assertEquals("world", newNode.getWholeText());
    }

}