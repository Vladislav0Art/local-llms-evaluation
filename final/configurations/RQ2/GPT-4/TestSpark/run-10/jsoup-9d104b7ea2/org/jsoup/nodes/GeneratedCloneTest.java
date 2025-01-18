package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode originalNode = new TextNode("cloneTest");
        TextNode clonedNode = originalNode.clone();

        Assert.assertNotSame(originalNode, clonedNode);
        Assert.assertEquals(originalNode.text(), clonedNode.text());
    }

}