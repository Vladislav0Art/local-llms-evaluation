package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Test text");
        Appendable accum = new StringBuffer();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}