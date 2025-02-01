package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("");
        Assert.assertEquals("#text", node.nodeName());
    }

}