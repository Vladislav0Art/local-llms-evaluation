package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element el = new Element("div");
        el.id("myDiv");
        Assert.assertEquals("<div id=\"myDiv\"></div>", el.toString());
    }

}