package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("testing");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}