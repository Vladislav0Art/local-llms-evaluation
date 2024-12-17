package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestTextNodeNoText {

    @Test
    public void testTextNodeNoText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("", node.getText());
    }

}