package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attribute attribute = attributes.asList().get(0);
        Assert.assertEquals("key", attribute.getKey());
        Assert.assertEquals("value", attribute.getValue());
    }

}