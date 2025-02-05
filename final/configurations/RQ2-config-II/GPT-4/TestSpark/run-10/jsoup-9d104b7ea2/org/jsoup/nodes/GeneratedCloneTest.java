package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("sample text");
        TextNode cloned = textNode.clone();
        Assert.assertEquals(textNode.text(), cloned.text());
        Assert.assertNotSame(textNode, cloned);
    }

}