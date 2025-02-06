package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_GivenEncodedText_ReturnsCreatedTextNode {

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsCreatedTextNode() {
        String encodedText = "Hello%2C+World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("textNode", textNode.nodeName());
        assertEquals(encodedText, textNode.text());
    }

}