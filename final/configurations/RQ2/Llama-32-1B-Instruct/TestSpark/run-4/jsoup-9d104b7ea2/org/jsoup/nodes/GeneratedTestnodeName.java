package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.nodeName());
    }

}