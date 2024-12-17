package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedText_shouldReturnOriginalText {

    @Test
    public void text_shouldReturnOriginalText() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}