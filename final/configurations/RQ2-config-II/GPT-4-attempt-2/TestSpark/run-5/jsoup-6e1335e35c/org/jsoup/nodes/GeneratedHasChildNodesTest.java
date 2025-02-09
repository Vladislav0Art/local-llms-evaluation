package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.hasChildNodes());
        element.appendChild(new Element("span"));
        Assert.assertTrue(element.hasChildNodes());
    }

}