package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode tn = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlTail(sb, 0, new Document.OutputSettings());
        Assert.assertEquals("", sb.toString());
    }

}