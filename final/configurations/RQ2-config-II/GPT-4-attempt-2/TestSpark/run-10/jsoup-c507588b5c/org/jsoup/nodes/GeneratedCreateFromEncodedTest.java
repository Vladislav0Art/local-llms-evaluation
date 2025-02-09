package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "sample&nbsp;text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("sample text", textNode.text());
    }

}