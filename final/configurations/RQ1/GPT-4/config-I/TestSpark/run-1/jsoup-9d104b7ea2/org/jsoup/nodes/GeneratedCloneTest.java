package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("CloneTest");
        TextNode clonedNode = textNode.clone();
        Assert.assertEquals(clonedNode.getWholeText(), textNode.getWholeText());
    }

}