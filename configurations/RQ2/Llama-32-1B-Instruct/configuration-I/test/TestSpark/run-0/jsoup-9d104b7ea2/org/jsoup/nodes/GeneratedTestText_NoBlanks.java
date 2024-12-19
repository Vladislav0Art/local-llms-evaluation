package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestText_NoBlanks {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testText_NoBlanks() {
        TextNode node = createNode();
        assertEquals("Hello World", node.getText());
    }

}