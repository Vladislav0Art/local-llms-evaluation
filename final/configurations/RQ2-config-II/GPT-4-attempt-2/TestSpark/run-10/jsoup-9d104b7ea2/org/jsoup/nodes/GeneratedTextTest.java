package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Hello");
        Assert.assertEquals("Hello", textNode.text());
        textNode.text("World");
        Assert.assertEquals("World", textNode.text());
    }

}