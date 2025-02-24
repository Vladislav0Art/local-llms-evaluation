package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("hello");
        Assert.assertEquals("hello", textNode.getWholeText());
    }

}