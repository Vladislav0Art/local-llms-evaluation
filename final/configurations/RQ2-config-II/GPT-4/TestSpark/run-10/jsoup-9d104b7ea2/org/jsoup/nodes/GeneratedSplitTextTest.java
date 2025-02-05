package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("sample text");
        TextNode split = textNode.splitText(6);
        Assert.assertEquals("sample", textNode.getWholeText());
        Assert.assertEquals(" text", split.getWholeText());
    }

}