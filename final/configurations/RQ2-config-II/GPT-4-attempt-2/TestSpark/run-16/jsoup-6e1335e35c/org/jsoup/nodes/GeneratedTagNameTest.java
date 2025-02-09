package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        element.tagName("span");
        Assert.assertEquals("span", element.tagName());
    }

}