package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        Assert.assertEquals("tag", element.tagName());
    }

}