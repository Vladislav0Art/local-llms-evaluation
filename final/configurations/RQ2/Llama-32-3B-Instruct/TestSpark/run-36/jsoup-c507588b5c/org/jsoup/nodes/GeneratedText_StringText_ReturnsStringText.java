package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedText_StringText_ReturnsStringText {

    @Test
    public void text_StringText_ReturnsStringText() {
        String text = "Hello";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}