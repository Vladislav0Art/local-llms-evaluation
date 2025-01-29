package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("TextNode {nodeName='text'}", node.toString());
    }

}