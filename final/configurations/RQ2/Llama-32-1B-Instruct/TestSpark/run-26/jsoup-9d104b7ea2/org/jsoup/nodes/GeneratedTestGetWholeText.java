package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.getWholeText());
    }

}