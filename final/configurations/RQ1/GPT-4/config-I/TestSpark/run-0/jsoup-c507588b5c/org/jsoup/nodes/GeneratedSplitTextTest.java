package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode tailNode = textNode.splitText(2);
        Assert.assertEquals("Te", textNode.getWholeText());
        Assert.assertEquals("st", tailNode.getWholeText());
    }

}