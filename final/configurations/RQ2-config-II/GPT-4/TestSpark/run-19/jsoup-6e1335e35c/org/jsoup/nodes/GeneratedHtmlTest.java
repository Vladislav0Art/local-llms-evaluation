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

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        element.html("<span>text</span>");
        Assert.assertEquals("<span>text</span>", element.html());
    }

}