package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneNodeTest {

    @Test
    public void cloneNodeTest() {
        TextNode textNode = new TextNode("Test Node");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}