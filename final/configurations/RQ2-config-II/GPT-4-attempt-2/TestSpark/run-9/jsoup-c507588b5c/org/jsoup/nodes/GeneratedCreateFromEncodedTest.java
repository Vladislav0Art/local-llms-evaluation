package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Sample Text");

        Assert.assertEquals("Sample Text", textNode.text());
    }

}