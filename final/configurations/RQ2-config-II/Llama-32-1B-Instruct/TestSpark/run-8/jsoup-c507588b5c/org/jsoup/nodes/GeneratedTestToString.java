package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToString {

    private TextNode rootNode;

    @Test
    public void testToString() {
        rootNode = new TextNode("Hello World");
        assertEquals("Hello World", rootNode.toString());
    }

}