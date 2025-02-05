package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddClassTest {

    @Test
    public void addClassTest() {
        Element element = new Element("tag");
        element.addClass("myClass");
        Assert.assertTrue(element.hasClass("myClass"));
    }

}