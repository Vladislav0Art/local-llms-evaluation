package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Hello World");
        Assert.assertEquals("Hello World", textNode.text());
        textNode.text("Hello Jsoup");
        Assert.assertEquals("Hello Jsoup", textNode.text());
    }

}