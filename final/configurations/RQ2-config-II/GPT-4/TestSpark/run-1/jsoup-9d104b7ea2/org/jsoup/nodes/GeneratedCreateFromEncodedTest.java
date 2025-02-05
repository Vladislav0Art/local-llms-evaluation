package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertNotNull(textNode);
    }

}