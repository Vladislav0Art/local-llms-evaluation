package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedToString_Basic_Test {

    @Test
    public void toString_Basic_Test() {
        TextNode textNode = new TextNode("testText");
        Assert.assertEquals("testText", textNode.toString());
    }

}