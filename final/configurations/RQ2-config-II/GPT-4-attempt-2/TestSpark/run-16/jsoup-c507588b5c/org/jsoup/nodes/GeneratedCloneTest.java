package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test text");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}