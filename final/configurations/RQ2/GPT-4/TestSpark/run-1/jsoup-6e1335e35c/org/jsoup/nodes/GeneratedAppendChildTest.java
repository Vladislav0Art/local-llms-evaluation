package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        Assert.assertEquals(1, parent.childNodeSize());
        Assert.assertEquals("span", parent.child(0).nodeName());
    }

}