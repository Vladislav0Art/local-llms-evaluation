package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextNodeTest {

    @Test
    public void splitTextNodeTest() {
        TextNode textNode = new TextNode("TestNodeSplit");
        TextNode splitNode = textNode.splitText(8);
        Assert.assertEquals("TestNode", textNode.text());
        Assert.assertEquals("Split", splitNode.text());
    }

}