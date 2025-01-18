package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedClassNamesTest {

    @Test
    public void classNamesTest() {
        Element element = new Element("p").addClass("class1").addClass("class2");
        Assert.assertEquals(2, element.classNames().size());
        Assert.assertTrue(element.classNames().contains("class1"));
        Assert.assertTrue(element.classNames().contains("class2"));
    }

}