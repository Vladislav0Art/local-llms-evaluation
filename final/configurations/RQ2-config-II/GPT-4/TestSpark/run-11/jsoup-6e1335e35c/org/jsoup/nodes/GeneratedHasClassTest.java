package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element e = new Element("tag", new Attributes());
        e.addClass("new-class");
        Assert.assertTrue(e.hasClass("new-class"));
    }

}