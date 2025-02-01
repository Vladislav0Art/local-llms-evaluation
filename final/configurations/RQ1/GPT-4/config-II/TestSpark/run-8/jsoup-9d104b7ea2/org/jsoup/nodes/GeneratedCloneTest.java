package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertNotSame(textNode, textNode.clone());
        Assert.assertEquals(textNode.getWholeText(), textNode.clone().getWholeText());
    }

}