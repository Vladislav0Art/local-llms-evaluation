package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_ReturnsTextContent {

    @Test
    public void text_ReturnsTextContent() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World!", textNode.text());
    }

}