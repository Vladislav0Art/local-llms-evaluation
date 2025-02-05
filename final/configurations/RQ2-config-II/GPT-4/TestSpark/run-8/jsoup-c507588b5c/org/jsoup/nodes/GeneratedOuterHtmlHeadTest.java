package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder builder = new StringBuilder();
        OutputSettings outputSettings = new OutputSettings();
        TextNode textNode = new TextNode("Sample Text");
        textNode.outerHtmlHead(builder, 0, outputSettings);
        Assert.assertEquals("Sample Text", builder.toString());
    }

}