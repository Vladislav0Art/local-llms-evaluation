package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Some text");
        TextNode newTextNode = textNode.splitText(4);
        Assert.assertEquals("Some", textNode.text());
        Assert.assertEquals(" text", newTextNode.text());
    }

}