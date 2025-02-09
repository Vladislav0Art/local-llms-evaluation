package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailNormalTest {

    @Test
    public void outerHtmlTailNormalTest() {
        TextNode tNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}