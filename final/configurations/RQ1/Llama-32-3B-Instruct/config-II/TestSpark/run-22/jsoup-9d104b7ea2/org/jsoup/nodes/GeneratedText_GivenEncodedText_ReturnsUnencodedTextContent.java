package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_GivenEncodedText_ReturnsUnencodedTextContent {

    @Test
    public void text_GivenEncodedText_ReturnsUnencodedTextContent() throws IOException {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Hello&gt; World", textNode.text());
    }

}