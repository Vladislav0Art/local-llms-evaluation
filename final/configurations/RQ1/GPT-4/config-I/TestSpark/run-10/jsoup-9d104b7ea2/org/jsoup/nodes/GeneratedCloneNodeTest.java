package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneNodeTest {

    @Test
    public void cloneNodeTest() {
        TextNode textNode = new TextNode("Test Node");
        Assert.assertNotSame(textNode, textNode.clone());
        Assert.assertEquals(textNode.text(), textNode.clone().text());
    }

}