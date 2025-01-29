package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestTextFromEncoded {

    @Test
    public void testTextFromEncoded() {
        String encodedText = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

}