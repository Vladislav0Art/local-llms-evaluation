package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedText_TextProvided_Works {

    @Test
    public void text_TextProvided_Works() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.text());
        assertEquals(text, textNode.text());
    }

}