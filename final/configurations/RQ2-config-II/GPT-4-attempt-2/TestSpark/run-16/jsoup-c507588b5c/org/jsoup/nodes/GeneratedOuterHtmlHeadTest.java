package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test text");
        Appendable accum = new StringBuffer();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("Test text", accum.toString());
    }

}