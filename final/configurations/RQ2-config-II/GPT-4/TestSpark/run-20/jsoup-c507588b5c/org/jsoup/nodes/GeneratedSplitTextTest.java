package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Text to Split";
        int splitPoint = 4;
        TextNode textNode = new TextNode(text);
        TextNode splitted = textNode.splitText(splitPoint);
        Assert.assertEquals(text.substring(0, splitPoint), textNode.text());
        Assert.assertEquals(text.substring(splitPoint), splitted.text());
    }

}