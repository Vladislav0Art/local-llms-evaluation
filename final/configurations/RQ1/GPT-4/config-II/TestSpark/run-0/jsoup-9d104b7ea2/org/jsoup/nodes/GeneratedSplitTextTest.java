package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test case");
        TextNode splitNode = textNode.splitText(4);
        Assert.assertEquals("Test", textNode.getWholeText());
        Assert.assertEquals(" case", splitNode.getWholeText());
    }

}