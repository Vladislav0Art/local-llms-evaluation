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

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        element.attr("key", "value");
        Assert.assertEquals("value", element.attr("key"));
    }

}