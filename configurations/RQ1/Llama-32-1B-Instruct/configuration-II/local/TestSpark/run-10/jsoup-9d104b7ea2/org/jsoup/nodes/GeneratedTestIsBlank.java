package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode text = new TextNode("   Hello World!   ");
        assertTrue(text.isBlank());

        text = new TextNode();
        assertTrue(text.isBlank());

        text = new TextNode("\n");
        assertTrue(text.isBlank());
    }

}