package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedAttributesTest {

    @Test
    public void attributesTest() {
        Element element = new Element("p");
        element.attr("class", "test");
        Assert.assertEquals("test", element.attributes().get("class"));
    }

}