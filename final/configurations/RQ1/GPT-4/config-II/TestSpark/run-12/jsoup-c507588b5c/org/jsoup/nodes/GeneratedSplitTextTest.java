package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode splitNode = textNode.splitText(7);

        Assert.assertEquals("Hello, ", textNode.getWholeText());
        Assert.assertEquals("world!", splitNode.getWholeText());
    }

}