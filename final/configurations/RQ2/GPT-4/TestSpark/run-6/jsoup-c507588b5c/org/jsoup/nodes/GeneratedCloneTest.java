package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test text");
        TextNode clonedNode = node.clone();
        Assert.assertEquals(node.getWholeText(), clonedNode.getWholeText());
    }

}