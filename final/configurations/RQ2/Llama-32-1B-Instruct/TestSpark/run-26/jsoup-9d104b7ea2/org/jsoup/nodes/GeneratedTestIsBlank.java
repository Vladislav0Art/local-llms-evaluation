package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertEquals(false, node.isBlank());
    }

}