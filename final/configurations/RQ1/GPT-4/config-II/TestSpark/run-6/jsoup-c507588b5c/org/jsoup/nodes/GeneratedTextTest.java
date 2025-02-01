package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" test test ");
        Assert.assertEquals("test test", textNode.text());
    }

}