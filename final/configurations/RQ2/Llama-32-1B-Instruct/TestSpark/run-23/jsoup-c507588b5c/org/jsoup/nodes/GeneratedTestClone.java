package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node1 = new TextNode(text);
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}