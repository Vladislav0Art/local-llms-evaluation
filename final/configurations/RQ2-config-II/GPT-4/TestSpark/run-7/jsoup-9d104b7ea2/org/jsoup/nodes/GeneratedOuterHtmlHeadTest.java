package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String text = "example text";
        TextNode textNode = new TextNode(text);
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, outputSettings);
        Assert.assertEquals(text, accum.toString());
    }

}