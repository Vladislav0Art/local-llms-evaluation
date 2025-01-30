package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" test ");
        Assert.assertEquals("test", textNode.text());
    }

}