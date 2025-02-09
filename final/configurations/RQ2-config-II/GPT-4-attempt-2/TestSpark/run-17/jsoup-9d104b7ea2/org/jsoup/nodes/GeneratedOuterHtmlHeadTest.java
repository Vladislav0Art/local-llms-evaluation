package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Document.OutputSettings outputSettings = new Document("").outputSettings();
        TextNode node = new TextNode("<div>Testing</div>");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, outputSettings);
        Assert.assertEquals("&lt;div&gt;Testing&lt;/div&gt;", accum.toString());
    }

}