package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
        textNode.text("Hello");
        Assert.assertFalse(textNode.isBlank());
    }

}