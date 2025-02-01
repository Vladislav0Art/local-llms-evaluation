package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode originalNode = new TextNode("Test Text");
        TextNode clonedNode = originalNode.clone();
        Assert.assertNotSame(originalNode, clonedNode);
        Assert.assertEquals(originalNode.getWholeText(), clonedNode.getWholeText());
    }

}