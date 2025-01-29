package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestToStringValue {

    public static Document createTreeNode(String text) {
        return document.createElement("TEXT_NODE");
    }

    @Test
    public void testToStringValue() {
        assertEquals(0L, createTextNode(new String[]{}).toStringValue(), 5);
        assertEquals(0L, new TextNode("").toStringValue(), 5);
        assertEquals(1L, new TextNode("Hello").toStringValue(), 5);
    }

}