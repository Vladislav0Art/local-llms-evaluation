package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestText_WithBlank {

    @Test
    public void testText_WithBlank() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}