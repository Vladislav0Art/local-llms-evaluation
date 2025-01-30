package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedAddAttributeTest {

    @Test
    public void addAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        Assert.assertTrue(attributes.hasKey("attr1"));
        Assert.assertEquals("value1", attributes.get("attr1"));
    }

}