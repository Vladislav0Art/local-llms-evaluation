package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        Assert.assertEquals("test", accum.toString());
    }

}