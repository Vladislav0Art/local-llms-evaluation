package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedAfterTest {

    @Test
    public void afterTest() {
        Element element = new Element("div").text("Test");
        element.after(" Now");
        Assert.assertEquals("Test Now", element.text());
    }

}