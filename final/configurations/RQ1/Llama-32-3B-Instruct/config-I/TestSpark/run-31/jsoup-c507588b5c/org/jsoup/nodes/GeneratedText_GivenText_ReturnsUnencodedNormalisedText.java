package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedText_GivenText_ReturnsUnencodedNormalisedText {

    @Test
    public void text_GivenText_ReturnsUnencodedNormalisedText() {
        String text = "Hello World";
        Node textNode = new Node(text);
        assertEquals("Hello World", textNode.text());
    }

}