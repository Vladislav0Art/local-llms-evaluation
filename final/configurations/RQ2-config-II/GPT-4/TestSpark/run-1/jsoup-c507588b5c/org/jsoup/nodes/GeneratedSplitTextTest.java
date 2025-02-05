package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Split TextNode Test";
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(7);
        Assert.assertEquals("TextNode", splitNode.text());
    }

}