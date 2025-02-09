package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GeneratedClassNamesTest {

    @Test
    public void classNamesTest() {
        Element element = new Element("tag");
        element.attr("class", "class1 class2");
        Assert.assertEquals(element.classNames().size(), 2);
        Assert.assertTrue(element.classNames().contains("class1"));
        Assert.assertTrue(element.classNames().contains("class2"));
    }

}