package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeToString {

    @Test
    public void testTextNodeToString() {
        String text = "Hello World";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        assertEquals("Hello World", node.toString().trim());
    }

}