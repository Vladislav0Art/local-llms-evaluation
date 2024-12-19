package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedText_ReturnsTextNodeWithUnencodedContent {

    @Test
    public void createFromEncodedText_ReturnsTextNodeWithUnencodedContent() throws IOException {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Hello&gt;", textNode.toString());
    }

}