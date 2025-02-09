package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        Assert.assertEquals(1, element.select(".test").size());
    }

}