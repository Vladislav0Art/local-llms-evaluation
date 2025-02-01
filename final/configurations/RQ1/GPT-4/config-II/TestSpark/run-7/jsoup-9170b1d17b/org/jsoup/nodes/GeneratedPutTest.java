package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
        attributes.put("key", "new value");
        Assert.assertEquals("new value", attributes.get("key"));
    }

}