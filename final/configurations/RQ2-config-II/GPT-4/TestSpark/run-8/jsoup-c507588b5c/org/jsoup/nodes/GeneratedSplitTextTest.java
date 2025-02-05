package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Sample");
        TextNode splitNode = textNode.splitText(3);
        Assert.assertEquals("ple", splitNode.text());
        Assert.assertEquals("Sam", textNode.text());
    }

}