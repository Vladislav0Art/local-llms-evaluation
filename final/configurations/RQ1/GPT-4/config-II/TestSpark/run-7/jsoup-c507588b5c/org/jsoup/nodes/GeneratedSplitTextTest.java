package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("This is a test");
        TextNode tailNode = node.splitText(8);
        Assert.assertEquals("This is ", node.getWholeText());
        Assert.assertEquals("a test", tailNode.getWholeText());
    }

}