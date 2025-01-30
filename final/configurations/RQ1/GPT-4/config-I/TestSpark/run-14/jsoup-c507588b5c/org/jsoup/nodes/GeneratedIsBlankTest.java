package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode emptyNode = new TextNode("");
        TextNode spaceNode = new TextNode("     ");
        TextNode textNode = new TextNode("Test Node");
        Assert.assertTrue(emptyNode.isBlank());
        Assert.assertTrue(spaceNode.isBlank());
        Assert.assertFalse(textNode.isBlank());
    }

}