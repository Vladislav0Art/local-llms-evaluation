package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element element = new Element("div");
        element.addClass("testClass");
        Assert.assertTrue(element.hasClass("testClass"));
    }

}