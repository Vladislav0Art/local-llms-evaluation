package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestToStringEmptyStringValue {

    public static Document createTreeNode(String text) {
        return document.createElement("TEXT_NODE");
    }

    @Test
    public void testToStringEmptyStringValue() {
        assertEquals("", new TextNode("").toStringValue());
    }

}