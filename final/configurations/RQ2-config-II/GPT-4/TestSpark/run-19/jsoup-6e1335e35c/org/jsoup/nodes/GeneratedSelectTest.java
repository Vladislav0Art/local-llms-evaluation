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

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Document document = Jsoup.parse("<div><p class='pclass'>text</p><p>no class</p></div>");
        Elements elements = document.select(".pclass");
        Assert.assertEquals(1, elements.size());
    }

}