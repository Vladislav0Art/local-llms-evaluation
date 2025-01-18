package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.text());
        Assert.assertEquals("st", newTextNode.text());
    }

}