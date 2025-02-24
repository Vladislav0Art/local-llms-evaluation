package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("hello");
        textNode.text("world");
        Assert.assertEquals("world", textNode.text());
    }

}