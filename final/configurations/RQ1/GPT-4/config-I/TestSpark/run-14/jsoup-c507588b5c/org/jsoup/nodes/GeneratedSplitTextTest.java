package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test Node");
        TextNode newNode = textNode.splitText(4);
        Assert.assertEquals("Test", textNode.getWholeText());
        Assert.assertEquals(" Node", newNode.getWholeText());
    }

}