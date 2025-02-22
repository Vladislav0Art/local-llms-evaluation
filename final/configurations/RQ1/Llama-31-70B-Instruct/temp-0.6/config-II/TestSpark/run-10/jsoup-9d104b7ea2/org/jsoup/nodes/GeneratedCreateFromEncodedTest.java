package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;div&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<div>", textNode.text());
    }

}