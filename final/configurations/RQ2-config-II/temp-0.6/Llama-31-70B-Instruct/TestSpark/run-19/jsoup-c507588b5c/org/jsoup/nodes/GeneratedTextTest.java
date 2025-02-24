package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("hello");
        Assert.assertEquals("hello", textNode.text());
    }

}