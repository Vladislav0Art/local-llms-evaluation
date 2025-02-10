package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestSplittingText {

    @Test
    public void testSplittingText() {
        TextNode node = new TextNode("Hello, world! This is a line of text.");
        TextNode tail = node.splitText(0);
        Assert.assertTrue(tail.isBlank());
        Assert.assertFalse(node.isBlank());
    }

}