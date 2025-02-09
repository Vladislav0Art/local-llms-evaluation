package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedTextNodesTest {

    @Test
    public void textNodesTest() {
        Element element = new Element("div").text("Test");
        Assert.assertEquals("Test", element.textNodes().get(0).text());
    }

}