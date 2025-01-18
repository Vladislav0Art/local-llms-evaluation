package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class GeneratedAttributesIteratorTest {

    @Test
    public void attributesIteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", "testValue");
        Iterator<Attribute> iterator = attributes.iterator();
        Attribute attribute = iterator.next();
        Assert.assertEquals("testKey", attribute.getKey());
        Assert.assertEquals("testValue", attribute.getValue());
    }

}