package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestTextNodeWithSpaces {

    @Test
    public void testTextNodeWithSpaces() {
        TextNode node = new TextNode("   Hello   World  ");
        assertEquals("Hello World", node.getText());
    }

}