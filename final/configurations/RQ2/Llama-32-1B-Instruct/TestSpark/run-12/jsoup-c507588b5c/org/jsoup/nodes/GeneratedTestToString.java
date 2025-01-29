package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestToString {

    public static Document createTreeNode(String text) {
        return document.createElement("TEXT_NODE");
    }

    @Test
    public void testToString() {
        assertEquals("TEXT_NODE", createTreeNode("").toString());
        assertEquals("TEXT_NODE", createTextNode(new String[]{}).toString());
        assertEquals("TEXT_NODE", createTextNode(null).toString());
        assertEquals("Hello", new TextNode("Hello").text().toString());
    }

}