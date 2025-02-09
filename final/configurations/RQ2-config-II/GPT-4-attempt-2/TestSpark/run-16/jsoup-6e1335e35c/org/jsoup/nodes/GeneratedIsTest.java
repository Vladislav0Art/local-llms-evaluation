package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedIsTest {

    @Test
    public void isTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        Assert.assertTrue(element.is(".test"));
    }

}