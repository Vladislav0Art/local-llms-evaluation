package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode clonedTextNode = textNode.clone();

        Assert.assertEquals(textNode.text(), clonedTextNode.text());
        Assert.assertNotSame(textNode, clonedTextNode);
    }

}