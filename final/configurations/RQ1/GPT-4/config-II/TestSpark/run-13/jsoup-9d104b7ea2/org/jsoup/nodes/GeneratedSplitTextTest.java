package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split Test");
        TextNode splittedNode = textNode.splitText(5);
        Assert.assertEquals("Split", textNode.getWholeText());
        Assert.assertEquals(" Test", splittedNode.getWholeText());
    }

}