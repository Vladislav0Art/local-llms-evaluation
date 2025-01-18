package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class GeneratedGetAttributeIgnoreCaseTest {

    @Test
    public void getAttributeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        Assert.assertEquals("testValue", attributes.getIgnoreCase("testkey"));
    }

}