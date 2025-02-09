package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedElementAttrSetterTest {

    @Test
    public void elementAttrSetterTest() {
        Element element = new Element("img");
        element.attr("alt", "Alternative text");
        Assert.assertEquals("Alternative text", element.attr("alt"));
    }

}