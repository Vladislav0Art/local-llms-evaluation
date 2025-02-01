package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(5);
        Assert.assertEquals("Hello", textNode.getWholeText());
        Assert.assertEquals(" World", result.getWholeText());
    }

}