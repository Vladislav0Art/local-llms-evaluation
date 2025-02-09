package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        Assert.assertEquals("", element.baseUri());
        element = new Element("div", "http://example.com");
        Assert.assertEquals("http://example.com", element.baseUri());
    }

}