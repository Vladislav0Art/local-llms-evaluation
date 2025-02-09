package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    // Tests for TextNode(String text)

    @Test
    public void splitTextTest() {
        String initialText = "Hello, World!";
        TextNode node = new TextNode(initialText);
        TextNode splitNode = node.splitText(7);
        Assert.assertEquals("Hello, ", node.text());
        Assert.assertEquals("World!", splitNode.text());
    }

}