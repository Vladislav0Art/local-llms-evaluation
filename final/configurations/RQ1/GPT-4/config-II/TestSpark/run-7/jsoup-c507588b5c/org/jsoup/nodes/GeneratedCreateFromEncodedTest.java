package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Test&amp;lt;");
        Assert.assertEquals("Test&lt;", node.text());
    }

}