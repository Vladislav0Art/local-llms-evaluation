package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestText {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testText() {
        TextNode node = createNode();
        assertEquals("Hello World", node.getText());
    }

}