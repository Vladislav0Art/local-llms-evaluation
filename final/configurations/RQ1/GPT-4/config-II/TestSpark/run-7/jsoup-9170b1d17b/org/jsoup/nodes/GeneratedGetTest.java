package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
        Assert.assertEquals("", attributes.get("undefined_key"));
    }

}