package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test text");
        TextNode splitNode = textNode.splitText(4);
        Assert.assertEquals("Test", textNode.getWholeText());
        Assert.assertEquals(" text", splitNode.getWholeText());
    }

}