package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedText_NonEmptyString_ReturnsText {

    @Test
    public void text_NonEmptyString_ReturnsText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

}