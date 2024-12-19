package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNodeName {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testNodeName() {
        TextNode node = createNode();
        assertEquals("hello world", node.getNodeName());
    }

}