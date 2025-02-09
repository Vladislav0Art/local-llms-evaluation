package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;p&gt;Test text&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>Test text</p>", textNode.getWholeText());
    }

}