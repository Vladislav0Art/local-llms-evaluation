package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("outerHtmlHead");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        Assert.assertTrue(accum.toString().contains("outerHtmlHead"));
    }

}