package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextOverwriteTest {

    @Test
    public void textOverwriteTest() {
        TextNode node = new TextNode("test");
        node.text("newText");
        Assert.assertEquals("newText", node.text());
    }

}