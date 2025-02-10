package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestNewLineInText {

    @Test
    public void testNewLineInText() {
        TextNode node = new TextNode("\nHello, World!");
        Assert.assertTrue(node.isBlank());
    }

}