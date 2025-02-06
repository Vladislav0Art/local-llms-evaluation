package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedReturnsCorrectTextNode {

    @Test
    public void createFromEncodedReturnsCorrectTextNode() throws IOException {
        String encodedText = "textNode";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

}