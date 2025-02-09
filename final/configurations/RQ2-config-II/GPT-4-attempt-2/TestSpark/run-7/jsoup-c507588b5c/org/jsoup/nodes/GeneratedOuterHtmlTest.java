package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() throws IOException {
        TextNode tn = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        tn.outerHtmlHead(sb, 0, out);
        tn.outerHtmlTail(sb, 0, out);
        Assert.assertEquals("Test", sb.toString());
    }

}