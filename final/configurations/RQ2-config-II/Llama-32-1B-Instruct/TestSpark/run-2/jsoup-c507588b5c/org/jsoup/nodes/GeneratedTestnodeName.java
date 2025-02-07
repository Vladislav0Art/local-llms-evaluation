package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
        assertEquals("Hello", node.text());
        assertEquals("", node.getWholeText());
        assertEquals("Hello ", node.isBlank());
    }

}