package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test Case");
        TextNode split = textNode.splitText(5);
        Assert.assertEquals("Test ", textNode.text());
        Assert.assertEquals("Case", split.text());
    }

}