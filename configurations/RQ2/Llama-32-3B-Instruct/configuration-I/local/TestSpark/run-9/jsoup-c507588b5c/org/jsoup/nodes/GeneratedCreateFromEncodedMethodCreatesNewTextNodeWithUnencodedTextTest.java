package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedCreateFromEncodedMethodCreatesNewTextNodeWithUnencodedTextTest {

    @Test
    public void createFromEncodedMethodCreatesNewTextNodeWithUnencodedTextTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello&gt; &amp; World");
        assertEquals("Hello & World", textNode.text());
    }

}