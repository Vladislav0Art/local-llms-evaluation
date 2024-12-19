package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode text = new TextNode("<a href='#'>Hello</a>");
        assertEquals("<a href='#'>Hello</a>", text.toString());

        TextNode text2 = new TextNode("   Hello World!   ");
        assertEquals("   Hello World!   ", text2.toString());
    }

}