package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element el = new Element("div");
        el.attr("class", "btn");
        Elements selectedElements = el.select(".btn");
        Assert.assertEquals(1, selectedElements.size());
    }

}