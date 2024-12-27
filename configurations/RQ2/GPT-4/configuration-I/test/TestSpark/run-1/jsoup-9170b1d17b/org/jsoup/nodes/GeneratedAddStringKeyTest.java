package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedAddStringKeyTest {

    @Test
    public void addStringKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("test", "value");
        Assert.assertEquals("value", attributes.get("test"));
    }

}