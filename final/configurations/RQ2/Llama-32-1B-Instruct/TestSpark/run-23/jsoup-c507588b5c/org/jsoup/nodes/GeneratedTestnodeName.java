package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

}