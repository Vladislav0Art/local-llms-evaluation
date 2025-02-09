package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
        TextNode nonBlankTextNode = new TextNode("test");
        Assert.assertFalse(nonBlankTextNode.isBlank());
    }

}