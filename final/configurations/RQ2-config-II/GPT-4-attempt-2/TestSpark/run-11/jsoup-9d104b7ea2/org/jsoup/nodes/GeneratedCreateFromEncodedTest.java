package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    // Tests for TextNode(String text)

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Hello, World!");
        Assert.assertEquals("Hello, World!", node.text());
    }

}