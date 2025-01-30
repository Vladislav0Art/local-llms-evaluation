package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String oldText = "Old Text";
        TextNode textNode = new TextNode(oldText);
        TextNode tail = textNode.splitText(4);
        Assert.assertEquals("Old ", textNode.getWholeText());
        Assert.assertEquals("Text", tail.getWholeText());
    }

}