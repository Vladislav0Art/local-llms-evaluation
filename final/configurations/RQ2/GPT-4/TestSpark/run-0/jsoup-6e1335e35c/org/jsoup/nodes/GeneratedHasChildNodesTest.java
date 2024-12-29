package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element element = new Element("div");
        element.appendChild(new Element("span"));
        Assert.assertTrue(element.hasChildNodes());
    }

}