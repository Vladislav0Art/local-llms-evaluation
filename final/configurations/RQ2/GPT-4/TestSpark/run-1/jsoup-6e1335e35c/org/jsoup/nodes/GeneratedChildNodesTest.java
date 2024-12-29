package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedChildNodesTest {

    @Test
    public void childNodesTest() {
        Element element = Jsoup.parse("<div><span></span><a></a></div>");
        Assert.assertEquals(2, element.childNodeSize());
    }

}