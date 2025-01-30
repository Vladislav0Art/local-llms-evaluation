package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextNodeTest {

    @Test
    public void splitTextNodeTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode newTextNode = node.splitText(2);
        Assert.assertEquals("te", node.getWholeText());
        Assert.assertEquals("st", newTextNode.getWholeText());
    }

}