package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("This is TextNode. Split it");
        TextNode splitNode = textNode.splitText(10);
        Assert.assertEquals("TextNode. Split it", splitNode.getWholeText());
    }

}