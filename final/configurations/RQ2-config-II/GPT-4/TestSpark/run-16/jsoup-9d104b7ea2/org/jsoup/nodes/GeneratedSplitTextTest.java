package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode splitNode = node.splitText(2);
        Assert.assertEquals("te", node.text());
        Assert.assertEquals("st", splitNode.text());
    }

}