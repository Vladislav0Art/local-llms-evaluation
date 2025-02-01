package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertEquals("Hello, world!", textNode.toString());
    }

}