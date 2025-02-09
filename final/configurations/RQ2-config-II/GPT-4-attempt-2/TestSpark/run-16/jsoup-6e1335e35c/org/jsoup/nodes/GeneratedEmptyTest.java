package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedEmptyTest {

    @Test
    public void emptyTest() {
        Element element = new Element("div").text("Test");
        element.empty();
        Assert.assertEquals("", element.text());
    }

}