package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attribute attribute = attributes.iterator().next();
        Assert.assertEquals("key", attribute.getKey());
        Assert.assertEquals("value", attribute.getValue());
    }

}