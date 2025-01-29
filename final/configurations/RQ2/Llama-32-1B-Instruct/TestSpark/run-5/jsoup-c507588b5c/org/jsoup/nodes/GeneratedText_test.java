package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedText_test {

    @Test
    public void text_test() {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        assertEquals(originalText, node.text());
        assertEquals(originalText, node.text(originalText));
    }

}