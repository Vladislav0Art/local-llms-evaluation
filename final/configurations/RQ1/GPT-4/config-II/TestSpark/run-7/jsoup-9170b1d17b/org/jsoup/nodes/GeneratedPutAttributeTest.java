package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put(new Attribute("key", "value"));
        Assert.assertEquals("value", attributes.get("key"));
    }

}