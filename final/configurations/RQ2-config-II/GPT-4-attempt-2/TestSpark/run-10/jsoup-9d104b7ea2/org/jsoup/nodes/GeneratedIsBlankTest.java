package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("  ");
        Assert.assertTrue(textNode.isBlank());
        textNode.text("World");
        Assert.assertFalse(textNode.isBlank());
    }

}