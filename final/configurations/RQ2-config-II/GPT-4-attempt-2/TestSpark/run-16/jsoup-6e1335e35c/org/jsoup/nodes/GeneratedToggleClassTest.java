package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedToggleClassTest {

    @Test
    public void toggleClassTest() {
        Element element = new Element("div").toggleClass("test").toggleClass("test");
        Assert.assertFalse(element.hasClass("test"));
    }

}