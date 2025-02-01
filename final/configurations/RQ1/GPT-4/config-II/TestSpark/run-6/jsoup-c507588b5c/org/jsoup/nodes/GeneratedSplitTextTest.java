package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.getWholeText());
        Assert.assertEquals("st", splitNode.getWholeText());
    }

}