package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Hello World");
        TextNode newTextNode = node.splitText(5);
        assertEquals("Split Text failed", "Hello", node.text());
        assertEquals("New Text Node after split wrong text", "World", newTextNode.text());
    }

}