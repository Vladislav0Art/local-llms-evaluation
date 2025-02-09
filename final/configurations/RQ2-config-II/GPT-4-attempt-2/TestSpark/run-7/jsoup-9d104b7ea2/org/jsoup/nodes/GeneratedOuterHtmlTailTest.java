package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("outerHtmlTail");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document.OutputSettings());
        Assert.assertTrue(accum.toString().contains(""));
    }

}