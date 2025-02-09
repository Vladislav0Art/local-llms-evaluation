package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedAttrKeyAndValueTest {

    @Test
    public void attrKeyAndValueTest() {
        Element element = new Element("div");
        String key = "testKey";
        String value = "testValue";
        element.attr(key, value);
        Map<String, String> attributes = element.dataset();
        Assert.assertEquals(value, attributes.get(key));
    }

}