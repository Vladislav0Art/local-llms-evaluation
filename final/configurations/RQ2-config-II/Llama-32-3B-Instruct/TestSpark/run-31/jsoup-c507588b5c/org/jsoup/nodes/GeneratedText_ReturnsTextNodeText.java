package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_ReturnsTextNodeText {

    @Test
    public void text_ReturnsTextNodeText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}