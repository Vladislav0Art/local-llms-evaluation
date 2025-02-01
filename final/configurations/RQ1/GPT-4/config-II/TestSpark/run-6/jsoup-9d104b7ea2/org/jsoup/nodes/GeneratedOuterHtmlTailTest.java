package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws Exception {
        TextNode node = new TextNode("test");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, outputSettings);
        Assert.assertEquals("", accum.toString());
    }

}