package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new test");
        Assert.assertEquals("new test", textNode.text());
    }

}