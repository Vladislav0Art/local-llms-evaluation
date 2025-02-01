package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = textNode.clone();
        Assert.assertNotSame(textNode, cloneNode);
        Assert.assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

}