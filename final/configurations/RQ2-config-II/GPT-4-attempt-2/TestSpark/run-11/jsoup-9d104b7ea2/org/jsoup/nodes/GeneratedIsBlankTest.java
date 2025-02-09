package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    // Tests for TextNode(String text)

    @Test
    public void isBlankTest() {
        TextNode nonEmptyNode = new TextNode("Hello, World!");
        Assert.assertFalse(nonEmptyNode.isBlank());

        TextNode emptyNode = new TextNode("");
        Assert.assertTrue(emptyNode.isBlank());
    }

}