package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedText_text {

    @Test
    public void text_text() {
        String text = "This is a test.";
        TextNode node = new TextNode(text);
        assertEquals("text", node.text());
    }

}