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

public class GeneratedAppendTest {

    @Test
    public void appendTest() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>text</p>");
        Assert.assertEquals(1, div.children().size());
    }

}