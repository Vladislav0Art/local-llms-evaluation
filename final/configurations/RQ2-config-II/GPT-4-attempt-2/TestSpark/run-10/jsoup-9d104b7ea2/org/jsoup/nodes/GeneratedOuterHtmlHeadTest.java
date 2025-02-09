package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Hello");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document("").outputSettings());
        Assert.assertEquals("Hello", accum.toString());
    }

}