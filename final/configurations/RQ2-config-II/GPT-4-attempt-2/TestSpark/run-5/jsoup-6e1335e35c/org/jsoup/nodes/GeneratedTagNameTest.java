package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        Assert.assertEquals("div", element.tagName());
        element.tagName("span");
        Assert.assertEquals("span", element.tagName());
    }

}