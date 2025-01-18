package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Hello");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        try {
            textNode.outerHtmlHead(sb, 0, outputSettings);
            Assert.assertEquals("Hello", sb.toString());
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

}