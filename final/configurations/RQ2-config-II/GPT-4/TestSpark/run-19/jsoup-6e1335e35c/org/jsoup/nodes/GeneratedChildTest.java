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

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Document document = Jsoup.parse("<div><p>text</p></div>");
        Assert.assertEquals("p", document.select("div").first().child(0).tagName());
    }

}