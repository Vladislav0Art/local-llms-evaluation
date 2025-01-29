package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestText {

    public static Document createTreeNode(String text) {
        return document.createElement("TEXT_NODE");
    }

    @Test
    public void testText() {
        assertEquals("", new TextNode().text());
        assertEquals("Hello", new TextNode("Hello").text());
        assertEquals(null, new TextNode().text());
    }

}