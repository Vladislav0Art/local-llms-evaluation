package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("   Hello  World!");
        Assert.assertEquals("Hello, World!", node.toString());
    }

}