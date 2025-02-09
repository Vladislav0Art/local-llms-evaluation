package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Original Node");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.text(), clonedNode.text());
    }

}