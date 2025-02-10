package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("   Hello  World!");
        TextNode node2 = (TextNode) node1.clone();
        Assert.assertTrue(node2.isBlank());
    }

}