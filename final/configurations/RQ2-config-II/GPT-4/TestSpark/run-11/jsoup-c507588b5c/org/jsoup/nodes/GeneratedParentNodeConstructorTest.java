package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedParentNodeConstructorTest {

    @Test
    public void parentNodeConstructorTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertNotNull(textNode);
    }

}