package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test Node");
        Assert.assertEquals("Test Node", textNode.text());
    }

}