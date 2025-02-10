package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestBlank {

    @Test
    public void testBlank() {
        TextNode node = new TextNode("   Hello, World! ");
        Assert.assertTrue(node.isBlank());
    }

}