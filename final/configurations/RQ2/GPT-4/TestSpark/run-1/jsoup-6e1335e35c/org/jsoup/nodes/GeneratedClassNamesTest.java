package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedClassNamesTest {

    @Test
    public void classNamesTest() {
        Element element = new Element("div");
        element.addClass("testClass1");
        element.addClass("testClass2");
        Set<String> classNames = element.classNames();
        Assert.assertEquals(2, classNames.size());
        Assert.assertTrue(classNames.contains("testClass1"));
        Assert.assertTrue(classNames.contains("testClass2"));
    }

}