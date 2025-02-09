package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    // Tests for TextNode(String text)

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("#text", node.nodeName());
    }

}