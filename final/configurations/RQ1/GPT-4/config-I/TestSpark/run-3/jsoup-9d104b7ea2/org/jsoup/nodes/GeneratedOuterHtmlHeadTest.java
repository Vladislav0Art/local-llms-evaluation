package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Sample");
        StringBuilder out = new StringBuilder();
        textNode.outerHtmlHead(out, 0, new Document("Test").outputSettings());
        Assert.assertEquals("Sample", out.toString());
    }

}