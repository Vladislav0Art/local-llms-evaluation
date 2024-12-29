package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParentTest {

    @Test
    public void parentTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        Assert.assertEquals(parent, child.parent());
    }

}