package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToString {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testToString() {
        TextNode node = createNode();
        assertEquals("Hello World", node.toString());
    }

}