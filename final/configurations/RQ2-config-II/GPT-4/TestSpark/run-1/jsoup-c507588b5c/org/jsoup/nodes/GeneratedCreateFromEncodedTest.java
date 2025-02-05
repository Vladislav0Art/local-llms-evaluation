package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "Encoded &#x26; Test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("Encoded and Test", textNode.text());
    }

}