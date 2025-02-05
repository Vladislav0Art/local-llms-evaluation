package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedParentTest {

    @Test
    public void parentTest() {
        Document document = Jsoup.parse("<div><p>text</p></div>");
        Assert.assertEquals("div", document.select("p").first().parent().tagName());
    }

}