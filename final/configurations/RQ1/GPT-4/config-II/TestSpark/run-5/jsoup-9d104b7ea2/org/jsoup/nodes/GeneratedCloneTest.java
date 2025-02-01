package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode node2 = node.clone();

        Assert.assertEquals(node.nodeName(), node2.nodeName());
        Assert.assertEquals(node.text(), node2.text());
    }

}