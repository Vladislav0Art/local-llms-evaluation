package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Create an instance of the TextNode class with a blank string
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}