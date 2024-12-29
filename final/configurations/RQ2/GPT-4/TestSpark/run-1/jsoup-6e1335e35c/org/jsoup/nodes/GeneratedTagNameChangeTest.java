package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedTagNameChangeTest {

    @Test
    public void tagNameChangeTest() {
        Element element = new Element("tag");
        element.tagName("newTag");
        Assert.assertEquals("newTag", element.tagName());
    }

}