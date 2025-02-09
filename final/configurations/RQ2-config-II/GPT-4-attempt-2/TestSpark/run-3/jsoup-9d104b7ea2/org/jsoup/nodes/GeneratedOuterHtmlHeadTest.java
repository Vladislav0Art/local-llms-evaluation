package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("test", accum.toString());
    }

}