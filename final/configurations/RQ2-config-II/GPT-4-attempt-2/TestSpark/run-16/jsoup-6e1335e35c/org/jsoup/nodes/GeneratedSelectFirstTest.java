package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedSelectFirstTest {

    @Test
    public void selectFirstTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        Assert.assertNotNull(element.selectFirst(".test"));
    }

}