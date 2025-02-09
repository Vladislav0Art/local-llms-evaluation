package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String text = "&#x0041;";
        TextNode textNode = TextNode.createFromEncoded(text, false);
        Assert.assertNotNull(textNode);
        Assert.assertEquals("A", textNode.text());
    }

}