package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestTextWithBlank {

    @Test
    public void testTextWithBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertEquals("", node.text());
    }

}