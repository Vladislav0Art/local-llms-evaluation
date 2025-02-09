package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode newText = textNode.splitText(6);
        Assert.assertEquals("Text", newText.text());
    }

}