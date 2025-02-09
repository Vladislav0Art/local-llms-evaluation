package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadNormalTest {

    @Test
    public void outerHtmlHeadNormalTest() throws IOException {
        TextNode tNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tNode.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("test", accum.toString());
    }

}