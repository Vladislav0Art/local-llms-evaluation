package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());

        textNode = new TextNode("   ");
        Assert.assertTrue(textNode.isBlank());

        textNode = new TextNode("Hello, world!");
        Assert.assertFalse(textNode.isBlank());
    }

}