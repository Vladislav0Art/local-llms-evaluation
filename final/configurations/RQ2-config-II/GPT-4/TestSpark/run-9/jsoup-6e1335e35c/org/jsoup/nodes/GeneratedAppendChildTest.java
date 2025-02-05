package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.appendChild(child);
        Assert.assertEquals("child", parent.child(0).tagName());
    }

}