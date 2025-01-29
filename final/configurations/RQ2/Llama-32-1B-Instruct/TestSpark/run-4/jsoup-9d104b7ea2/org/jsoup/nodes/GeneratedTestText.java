package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

}