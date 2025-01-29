package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestText_noBlank {

    @Test
    public void testText_noBlank() {
        // Create an instance of the TextNode class with a non-blank text string
        String text = "Hello, World!  ";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}