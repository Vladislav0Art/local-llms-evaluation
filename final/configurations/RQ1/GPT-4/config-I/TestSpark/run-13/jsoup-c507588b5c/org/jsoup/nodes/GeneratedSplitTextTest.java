package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode newNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.getWholeText());
        Assert.assertEquals("st", newNode.getWholeText());
    }

}