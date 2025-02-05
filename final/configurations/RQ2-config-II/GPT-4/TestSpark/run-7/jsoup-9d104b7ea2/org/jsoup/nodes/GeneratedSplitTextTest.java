package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void splitTextTest() {
        String text = "example text";
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(5);
        Assert.assertEquals(text.substring(5), splitNode.text());
        Assert.assertEquals(text.substring(0, 5), textNode.text());
    }

}