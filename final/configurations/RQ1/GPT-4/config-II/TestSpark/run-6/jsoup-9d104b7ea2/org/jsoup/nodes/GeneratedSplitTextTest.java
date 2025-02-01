package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode newNode = node.splitText(2);
        Assert.assertEquals("te", node.getWholeText());
        Assert.assertEquals("st", newNode.getWholeText());
    }

}