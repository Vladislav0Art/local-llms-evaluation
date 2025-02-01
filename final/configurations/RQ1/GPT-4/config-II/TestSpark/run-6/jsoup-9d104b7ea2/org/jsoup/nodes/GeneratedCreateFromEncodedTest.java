package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&lt;test&gt;");
        Assert.assertEquals("<test>", node.text());
    }

}