package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encoded = "&amp;";
        TextNode node = TextNode.createFromEncoded(encoded);
        Assert.assertEquals("&", node.text());
    }

}