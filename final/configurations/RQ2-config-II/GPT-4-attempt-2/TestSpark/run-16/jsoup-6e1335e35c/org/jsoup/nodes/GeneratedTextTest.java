package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element("div").text("Test");
        Assert.assertEquals("Test", element.text());
    }

}