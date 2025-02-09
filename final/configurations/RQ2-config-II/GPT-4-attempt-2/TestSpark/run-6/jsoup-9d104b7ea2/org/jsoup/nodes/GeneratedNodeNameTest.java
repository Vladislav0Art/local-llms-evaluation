package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals("#text", textNode.nodeName());
    }

}