package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(6);
        Assert.assertEquals("sample", textNode.getWholeText());
        Assert.assertEquals(" text", splitNode.getWholeText());
    }

}