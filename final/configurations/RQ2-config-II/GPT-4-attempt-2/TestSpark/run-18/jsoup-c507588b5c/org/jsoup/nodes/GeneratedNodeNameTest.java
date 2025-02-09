package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String text = "hello";
        TextNode node = new TextNode(text);
        Assert.assertEquals("Node name should be #text", "#text", node.nodeName());
    }

}