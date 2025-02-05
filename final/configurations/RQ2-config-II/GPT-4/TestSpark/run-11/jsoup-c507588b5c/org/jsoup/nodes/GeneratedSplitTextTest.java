package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode splitTextNode = textNode.splitText(6);
        Assert.assertEquals("world!", splitTextNode.getWholeText());
    }

}