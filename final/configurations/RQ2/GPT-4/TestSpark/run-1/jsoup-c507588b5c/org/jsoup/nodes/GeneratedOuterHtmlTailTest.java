package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        textNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}