package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("<text>HELLO WORLD</text>", textNode.toString());
    }

}