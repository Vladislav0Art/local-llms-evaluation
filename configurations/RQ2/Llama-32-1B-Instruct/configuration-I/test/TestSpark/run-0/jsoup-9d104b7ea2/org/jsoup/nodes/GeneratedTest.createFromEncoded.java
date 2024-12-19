package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest.

createFromEncoded {

    public TextNode createNode () {
        return new TextNode("Hello World");
    }

    @Test
    public void test.createFromEncoded() {
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", textNode.getText());
    }

}