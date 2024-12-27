package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Hello World");
        TextNode splitNode = node.splitText(5);
        Assert.assertEquals("Hello", node.text());
        Assert.assertEquals(" World", splitNode.text());
    }

}