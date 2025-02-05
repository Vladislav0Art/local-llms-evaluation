package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedAttributesTest {

    @Test
    public void attributesTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        Attributes attributes = element.attributes();
        Assert.assertEquals("test", attributes.get("class"));
    }

}