package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    // Tests for TextNode(String text)

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Hello, World!");
        TextNode cloneNode = node.clone();
        Assert.assertEquals(node.text(), cloneNode.text());
    }

}