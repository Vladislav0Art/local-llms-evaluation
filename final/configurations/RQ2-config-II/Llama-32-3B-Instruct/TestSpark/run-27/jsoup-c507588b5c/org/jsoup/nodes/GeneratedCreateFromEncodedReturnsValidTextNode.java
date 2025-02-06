package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedReturnsValidTextNode {

    @Test
    public void createFromEncodedReturnsValidTextNode() throws IOException {
        String encodedText = "<text>encoded</text>";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertTrue(textNode.text().equals("encoded"));
    }

}