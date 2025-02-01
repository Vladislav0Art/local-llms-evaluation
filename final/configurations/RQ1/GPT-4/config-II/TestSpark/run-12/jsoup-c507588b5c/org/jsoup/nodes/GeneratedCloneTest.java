package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode cloneNode = textNode.clone();

        Assert.assertNotSame(textNode, cloneNode);
        Assert.assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

}