package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestToStringNullValue {

    public static Document createTreeNode(String text) {
        return document.createElement("TEXT_NODE");
    }

    @Test
    public void testToStringNullValue() {
        assertEquals(null, createTextNode(new String[]{}).toStringValue());
    }

}