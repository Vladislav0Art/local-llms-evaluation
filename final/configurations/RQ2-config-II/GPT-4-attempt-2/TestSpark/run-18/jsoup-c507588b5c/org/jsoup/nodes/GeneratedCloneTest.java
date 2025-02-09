package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "hello";
        TextNode node = new TextNode(text);
        TextNode clonedNode = node.clone();
        Assert.assertNotSame("Nodes should not be the same", node, clonedNode);
        Assert.assertEquals("Text should be the same", node.getWholeText(), clonedNode.getWholeText());
    }

}