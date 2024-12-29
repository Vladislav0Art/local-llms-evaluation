package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        Assert.assertEquals("value", element.attr("key"));
    }

}