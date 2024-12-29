package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element("div");
        element.html("<span>Test</span>");
        Assert.assertEquals("<span>Test</span>", element.html());
    }

}