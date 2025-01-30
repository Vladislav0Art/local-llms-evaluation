package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String sampleText = "to test splitText";
        TextNode node = new TextNode(sampleText);
        TextNode splitNode = node.splitText(6);
        Assert.assertEquals("to test", node.getWholeText());
        Assert.assertEquals(" splitText", splitNode.getWholeText());
    }

}