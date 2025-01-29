package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestText {

    @Test
    public void testText() {
        // Create an instance of the TextNode class with a text string
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.text());
    }

}