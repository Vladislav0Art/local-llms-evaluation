package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode resultNode = textNode.splitText(6);
        Assert.assertEquals("Sample", textNode.text());
        Assert.assertEquals("Text", resultNode.text());
    }

}