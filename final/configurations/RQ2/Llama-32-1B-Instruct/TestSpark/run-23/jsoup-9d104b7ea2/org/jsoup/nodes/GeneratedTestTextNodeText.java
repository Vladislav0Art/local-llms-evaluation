package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeText {

    @Test
    public void testTextNodeText() {
        String text = "Hello World";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        assertEquals("Hello World", node.toString().trim());
    }

}