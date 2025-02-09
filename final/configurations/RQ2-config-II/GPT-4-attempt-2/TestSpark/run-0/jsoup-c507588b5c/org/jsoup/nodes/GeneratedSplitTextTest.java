package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("123456");
        TextNode splitNode = textNode.splitText(3);
        Assert.assertEquals("123", textNode.getWholeText());
        Assert.assertEquals("456", splitNode.getWholeText());
    }

}