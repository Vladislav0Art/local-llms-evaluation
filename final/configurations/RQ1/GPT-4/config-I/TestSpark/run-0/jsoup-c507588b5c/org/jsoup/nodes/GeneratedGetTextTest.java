package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedGetTextTest {

    @Test
    public void getTextTest() {
        TextNode textNode = new TextNode("  Test  ");
        Assert.assertEquals("Test", textNode.text());
    }

}