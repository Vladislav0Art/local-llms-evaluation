package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 1, new Document.OutputSettings());
        Assert.assertEquals("", accum.toString());
    }

}