package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextValidOffsetTest {

    @Test
    public void splitTextValidOffsetTest() {
        String text = "hello";
        TextNode node = new TextNode(text);
        TextNode newNode = node.splitText(2);
        Assert.assertEquals("Original node should contain the first part of the text", "he", node.getWholeText());
        Assert.assertEquals("New node should contain the second part of the text", "llo", newNode.getWholeText());
    }

}