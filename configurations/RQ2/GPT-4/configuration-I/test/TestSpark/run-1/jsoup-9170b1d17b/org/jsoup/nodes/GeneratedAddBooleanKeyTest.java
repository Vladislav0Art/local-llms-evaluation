package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedAddBooleanKeyTest {

    @Test
    public void addBooleanKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertEquals("", attributes.get("key")); // Boolean value is not stored
    }

}