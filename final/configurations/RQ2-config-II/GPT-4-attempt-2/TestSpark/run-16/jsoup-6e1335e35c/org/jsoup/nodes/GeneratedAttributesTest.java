package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedAttributesTest {

    @Test
    public void attributesTest() {
        Element element = new Element("div");
        element.attr("id", "testId");
        Assert.assertEquals("testId", element.attributes().get("id"));
    }

}