package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&amp;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertEquals("&", textNode.text());
    }

}