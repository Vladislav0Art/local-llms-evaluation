package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestnodeName {

    public static Document createTreeNode(String text) {
        return document.createElement("TEXT_NODE");
    }

    @Test
    public void testnodeName() {
        assertEquals("TEXT_NODE", createTreeNode("").nodeName());
        assertEquals("TEXT_NODE", createTextNode("Hello").nodeName());
        assertEquals("TEXT_NODE", createTextNode(null).nodeName());
    }

}