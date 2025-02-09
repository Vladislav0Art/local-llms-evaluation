package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedPrependTest {

    @Test
    public void prependTest() {
        Element element = new Element("div").append("Test");
        element.prepend("Now,");
        Assert.assertEquals("Now,Test", element.text());
    }

}