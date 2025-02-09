package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.text(), clonedNode.text());
    }

}