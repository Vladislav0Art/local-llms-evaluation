package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode newTextNode = textNode.splitText(2);
        Assert.assertEquals("Te", textNode.text());
        Assert.assertEquals("st", newTextNode.text());
    }

}