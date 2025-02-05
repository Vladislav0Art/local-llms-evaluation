package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode cloneTextNode = textNode.clone();
        Assert.assertEquals(cloneTextNode.text(), textNode.text());
    }

}