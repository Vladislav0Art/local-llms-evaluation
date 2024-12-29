package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element element = new Element("div");
        Element child = new Element("span");
        element.appendChild(child);
        Assert.assertEquals(1, element.childNodeSize());
    }

}