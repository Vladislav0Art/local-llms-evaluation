package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Document.OutputSettings outputSettings = new Document("").outputSettings();
        TextNode node = new TextNode("<div>Testing</div>");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, outputSettings);
        Assert.assertEquals("", accum.toString());
    }

}