package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedText_EmptyString_ReturnsEmptyString {

    @Test
    public void text_EmptyString_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}