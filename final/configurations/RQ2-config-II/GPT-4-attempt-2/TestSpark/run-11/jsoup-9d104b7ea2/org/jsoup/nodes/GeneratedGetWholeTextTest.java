package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    // Tests for TextNode(String text)

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Hello, World!");
        Assert.assertEquals("Hello, World!", node.getWholeText());
    }

}