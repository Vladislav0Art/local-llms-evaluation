package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_ValidText_ReturnsUnencodedText {

    @Test
    public void text_ValidText_ReturnsUnencodedText() throws IOException {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Test&gt;", textNode.text());
    }

}