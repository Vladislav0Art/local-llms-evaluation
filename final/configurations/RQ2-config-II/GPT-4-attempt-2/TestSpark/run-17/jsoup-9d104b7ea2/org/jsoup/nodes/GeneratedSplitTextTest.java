package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Split Text");
        TextNode splitNode = node.splitText(5);
        Assert.assertEquals("Split", node.text());
        Assert.assertEquals(" Text", splitNode.text());
    }

}