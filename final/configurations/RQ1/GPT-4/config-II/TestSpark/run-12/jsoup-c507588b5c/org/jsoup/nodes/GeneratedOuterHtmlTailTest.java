package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Hello, world!");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}