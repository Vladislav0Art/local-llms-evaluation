package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        TextNode node = new TextNode("test");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, outputSettings);
        Assert.assertEquals("test", accum.toString());
    }

}