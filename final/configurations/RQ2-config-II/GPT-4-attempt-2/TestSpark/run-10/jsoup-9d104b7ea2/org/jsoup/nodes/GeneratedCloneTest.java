package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello");
        TextNode cloneNode = textNode.clone();
        Assert.assertNotSame(textNode, cloneNode);
        Assert.assertEquals(textNode.text(), cloneNode.text());
    }

}