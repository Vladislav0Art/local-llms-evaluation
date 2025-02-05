package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("p");
        element.attr("data-test", "value");
        Assert.assertEquals("value", element.attributes().get("data-test"));
    }

}