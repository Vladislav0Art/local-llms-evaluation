package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestTextNodeToString {

    @Test
    public void testTextNodeToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.toString());
    }

}