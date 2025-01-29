package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", node.getWholeText());
    }

}