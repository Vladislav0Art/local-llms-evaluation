package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("New Test");
        Assert.assertEquals("New Test", textNode.text());
    }

}