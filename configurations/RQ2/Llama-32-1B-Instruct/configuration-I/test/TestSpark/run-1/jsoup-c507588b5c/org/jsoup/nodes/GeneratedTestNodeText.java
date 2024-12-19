package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestNodeText {

    @Test
    public void testNodeText() {
        String text = "Hello, World!";
        Node node = new Node(text).node;
        assertEquals(text, new String(node.getText()));

        Node clone = node.clone();
        assertEquals(text, new String(clone.getText()));

        Node nodeText1 = new Node("Hello, ".replace(" ", "_")).node;
        assertEquals(text.replace(" ", "_"), new String(nodeText1.getText()));
    }

}