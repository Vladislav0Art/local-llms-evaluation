package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.toString());
    }

}