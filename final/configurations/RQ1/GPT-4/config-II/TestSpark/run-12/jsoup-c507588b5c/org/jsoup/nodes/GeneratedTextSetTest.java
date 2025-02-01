package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("");
        textNode.text("Hello, world!");
        Assert.assertEquals("Hello, world!", textNode.text());
    }

}