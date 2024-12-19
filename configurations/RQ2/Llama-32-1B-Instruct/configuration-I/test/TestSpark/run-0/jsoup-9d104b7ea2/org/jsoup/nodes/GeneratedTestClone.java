package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestClone {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testClone() {
        TextNode node1 = createNode();
        TextNode node2 = node1.clone();
        assertTrue(node1 instanceof TextNode);
        assertTrue((TextNode) node2 == node1);
    }

}