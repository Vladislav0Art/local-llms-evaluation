package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("HELLO WORLD", textNode.text());
    }

}