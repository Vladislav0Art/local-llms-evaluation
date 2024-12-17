package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncoded_DecodedText_ReturnsCorrectEncodedText {

    @Test
    public void createFromEncoded_DecodedText_ReturnsCorrectEncodedText() {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello World", textNode.text());
    }

}