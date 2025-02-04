package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_GettingTextContent_ReturnsEncodedText {

    @Test
    public void text_GettingTextContent_ReturnsEncodedText() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("", textNode.text());
    }

}