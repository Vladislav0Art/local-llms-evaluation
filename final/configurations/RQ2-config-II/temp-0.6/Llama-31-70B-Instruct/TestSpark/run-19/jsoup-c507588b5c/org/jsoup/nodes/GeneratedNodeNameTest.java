package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("hello");
        Assert.assertEquals("#text", textNode.nodeName());
    }

}