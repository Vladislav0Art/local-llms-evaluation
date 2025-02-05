package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode split = node.splitText(2);
        Assert.assertEquals("te", node.getWholeText());
        Assert.assertEquals("st", split.getWholeText());
    }

}