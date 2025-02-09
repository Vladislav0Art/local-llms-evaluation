package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("testId");
        Assert.assertEquals("testId", element.id());
    }

}