package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    // Tests for TextNode(String text)

    @Test
    public void textTest() {
        TextNode node = new TextNode("Test string.");
        Assert.assertEquals("Test string.", node.text());
    }

}