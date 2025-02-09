package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("splitText");
        TextNode split = textNode.splitText(4);
        Assert.assertEquals("split", textNode.getWholeText());
        Assert.assertEquals("Text", split.getWholeText());
    }

}