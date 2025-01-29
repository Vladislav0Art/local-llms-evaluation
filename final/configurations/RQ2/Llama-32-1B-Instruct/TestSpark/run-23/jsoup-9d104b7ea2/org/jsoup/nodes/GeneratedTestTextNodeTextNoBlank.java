package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeTextNoBlank {

    @Test
    public void testTextNodeTextNoBlank() {
        String text = "Hello World\n";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        assertTrue(node.isBlank());
    }

}