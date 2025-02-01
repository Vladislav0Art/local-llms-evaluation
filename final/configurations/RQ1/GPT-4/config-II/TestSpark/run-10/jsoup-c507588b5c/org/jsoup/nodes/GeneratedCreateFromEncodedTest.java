package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encoded = "Hello&amp;World";
        TextNode textNode = TextNode.createFromEncoded(encoded);
        assertEquals("Hello&World", textNode.text());
    }

}