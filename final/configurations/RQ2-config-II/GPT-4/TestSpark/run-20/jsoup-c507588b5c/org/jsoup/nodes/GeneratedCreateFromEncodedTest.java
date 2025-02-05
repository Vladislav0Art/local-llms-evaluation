package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String text = "Encoded Text";
        TextNode textNode = TextNode.createFromEncoded(text);
        Assert.assertEquals(text, textNode.text());
    }

}