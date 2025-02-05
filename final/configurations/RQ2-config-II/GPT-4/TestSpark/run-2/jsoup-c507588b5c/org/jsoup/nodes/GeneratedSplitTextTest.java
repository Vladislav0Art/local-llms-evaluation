package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "test";
        int offset = 2;
        TextNode node = new TextNode(text);
        Assert.assertEquals("te", node.splitText(offset).text());
    }

}