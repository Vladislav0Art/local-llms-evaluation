package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void outerHtmlTailTest() throws IOException {
        String text = "example text";
        TextNode textNode = new TextNode(text);
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, outputSettings);
        Assert.assertEquals("", accum.toString()); // tail method should not append anything
    }

}