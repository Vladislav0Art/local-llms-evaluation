package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestNodeToString {

    @Test
    public void testNodeToString() {
        String nodeString = new Node("Hello, ").toString();
        assertEquals("Hello, ", nodeString);

        Node clone = new Node("World!").clone();
        String cloneString = new String(clone.toString());
        assertEquals("World!", cloneString);

        Node nodeText = new Node("Hello, World!".replace(" ", "_")).node;
        assertEquals("Hello, World!", new String(nodeText.getText()));
    }

}