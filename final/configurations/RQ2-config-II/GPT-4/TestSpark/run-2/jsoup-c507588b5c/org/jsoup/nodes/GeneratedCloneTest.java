package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.clone().text());
    }

}