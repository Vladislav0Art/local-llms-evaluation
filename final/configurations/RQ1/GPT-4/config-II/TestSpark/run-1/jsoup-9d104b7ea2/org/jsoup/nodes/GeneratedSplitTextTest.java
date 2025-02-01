package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Test Text";
        TextNode node = new TextNode(text);
        TextNode newNode = node.splitText(4);
        Assert.assertEquals("Test", node.getWholeText());
        Assert.assertEquals(" Text", newNode.getWholeText());
    }

}