package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedHasAttributesTest {

    @Test
    public void hasAttributesTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.hasAttributes());
        element.attr("id", "1");
        Assert.assertTrue(element.hasAttributes());
    }

}