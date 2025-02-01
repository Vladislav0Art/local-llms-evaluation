package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.toString());
    }

}