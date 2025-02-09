package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello");
        TextNode newText = textNode.splitText(3);
        Assert.assertEquals("Hel", textNode.text());
        Assert.assertEquals("lo", newText.text());
    }

}