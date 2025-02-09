package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Hello");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document("").outputSettings());
        Assert.assertEquals("", accum.toString());
    }

}