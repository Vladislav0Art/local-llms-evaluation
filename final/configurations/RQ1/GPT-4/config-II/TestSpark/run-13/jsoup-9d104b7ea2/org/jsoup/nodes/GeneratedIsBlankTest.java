package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode nonBlankNode = new TextNode("Test	Text");
        Assert.assertFalse(nonBlankNode.isBlank());

        TextNode blankNode1 = new TextNode("");
        Assert.assertTrue(blankNode1.isBlank());

        TextNode blankNode2 = new TextNode("		");
        Assert.assertTrue(blankNode2.isBlank());
    }

}