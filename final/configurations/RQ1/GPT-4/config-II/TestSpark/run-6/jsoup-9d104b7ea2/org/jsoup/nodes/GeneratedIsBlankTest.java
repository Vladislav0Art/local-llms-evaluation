package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("    ");
        Assert.assertTrue(node.isBlank());
    }

}