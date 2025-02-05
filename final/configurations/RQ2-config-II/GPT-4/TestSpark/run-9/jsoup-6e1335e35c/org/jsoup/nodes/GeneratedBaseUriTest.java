package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("tag");
        Assert.assertEquals("", element.baseUri());
    }

}