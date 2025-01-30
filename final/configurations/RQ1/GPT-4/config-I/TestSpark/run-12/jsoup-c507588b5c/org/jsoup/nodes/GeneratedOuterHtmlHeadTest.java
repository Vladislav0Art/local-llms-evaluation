package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String sampleText = "Test";
        TextNode node = new TextNode(sampleText);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        node.outerHtmlHead(accum, 1, out);
        Assert.assertEquals(sampleText, accum.toString());
    }

}