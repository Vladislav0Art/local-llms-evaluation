package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestToStringWithText {

    public static Document createTreeNode(String text) {
        return document.createElement("TEXT_NODE");
    }

    @Test
    public void testToStringWithText() {
        assertEquals("Hello", new TextNode("").text().toString());
        assertEquals("Hello", new TextNode("Hello").text().toString());
        assertEquals(null, new TextNode().text().toString());
    }

}