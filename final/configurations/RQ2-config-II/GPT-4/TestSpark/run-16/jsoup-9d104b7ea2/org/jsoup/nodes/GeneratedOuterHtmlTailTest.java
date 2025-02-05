package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        Assert.assertEquals("", accum.toString());
    }

}