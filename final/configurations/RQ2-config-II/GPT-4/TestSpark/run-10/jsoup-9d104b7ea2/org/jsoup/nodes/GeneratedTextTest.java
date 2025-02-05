package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("sample text");
        Assert.assertEquals("sample text", textNode.text());
    }

}