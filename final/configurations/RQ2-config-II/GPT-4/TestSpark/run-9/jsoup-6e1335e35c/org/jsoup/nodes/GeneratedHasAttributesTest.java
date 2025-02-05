package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHasAttributesTest {

    @Test
    public void hasAttributesTest() {
        Element element = new Element("tag");
        Assert.assertFalse(element.hasAttributes());
    }

}