package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHead_Basic_Test {

    @Test
    public void outerHtmlHead_Basic_Test() {
        TextNode textNode = new TextNode("testText");
        final StringBuilder builder = new StringBuilder();
        try {
            textNode.outerHtmlHead(builder, 0, new Document.OutputSettings());
        } catch (IOException e) {
            Assert.fail("Exception thrown: " + e.getMessage());
        }
        Assert.assertEquals("testText", builder.toString());
    }

}