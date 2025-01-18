package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Test text";
        int splitIndex = 4;
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(splitIndex);

        Assert.assertEquals(text.substring(0, splitIndex), textNode.getWholeText());
        Assert.assertEquals(text.substring(splitIndex), splitNode.getWholeText());
    }

}