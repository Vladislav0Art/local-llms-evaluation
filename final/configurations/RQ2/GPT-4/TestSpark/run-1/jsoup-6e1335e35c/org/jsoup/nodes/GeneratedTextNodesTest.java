package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedTextNodesTest {

    @Test
    public void textNodesTest() {
        Element element = Jsoup.parse("<p>Hello <strong>jsoup</strong></p>");
        List<TextNode> textNodes = element.textNodes();
        Assert.assertEquals(1, textNodes.size());
        Assert.assertEquals("Hello ", textNodes.get(0).text());
    }

}