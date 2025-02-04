package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_GivenText_ReturnsTextContent {

    @Test
    public void text_GivenText_ReturnsTextContent() throws IOException {
        String text = "test";
        TextNode textNode = new TextNode(text);
        assertEquals("test", textNode.text());
    }

}