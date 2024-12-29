package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("tag");
        element.id("testId");
        Assert.assertEquals("testId", element.id());
    }

}