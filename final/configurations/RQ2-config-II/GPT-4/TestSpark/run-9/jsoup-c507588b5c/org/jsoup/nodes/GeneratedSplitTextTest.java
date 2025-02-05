package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("some text");
        TextNode splitNode = node.splitText(4);
        Assert.assertEquals("some", node.getWholeText());
        Assert.assertEquals(" text", splitNode.getWholeText());
    }

}