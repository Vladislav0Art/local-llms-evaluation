package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        StringBuilder builder = new StringBuilder();
        OutputSettings outputSettings = new OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(builder, 0, outputSettings);
        Assert.assertEquals("", builder.toString());
    }

}