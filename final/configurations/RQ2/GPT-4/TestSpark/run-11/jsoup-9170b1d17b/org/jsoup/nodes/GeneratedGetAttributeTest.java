package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class GeneratedGetAttributeTest {

    @Test
    public void getAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        Assert.assertEquals("testValue", attributes.get("testKey"));
    }

}