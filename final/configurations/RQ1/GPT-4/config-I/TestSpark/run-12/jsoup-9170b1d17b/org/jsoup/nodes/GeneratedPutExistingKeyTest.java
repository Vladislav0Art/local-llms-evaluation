package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedPutExistingKeyTest {

    @Test
    public void putExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.put("key", "newValue");
        String result = attributes.get("key");
        Assert.assertEquals("newValue", result);
    }

}