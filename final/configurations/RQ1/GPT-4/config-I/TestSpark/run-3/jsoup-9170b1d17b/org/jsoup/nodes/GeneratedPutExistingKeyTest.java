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
        final String key = "key";
        final String oldValue = "oldValue";
        final String newValue = "newValue";
        final Attributes attributes = new Attributes();
        attributes.add(key, oldValue);

        attributes.put(key, newValue);

        final String result = attributes.get(key);
        Assert.assertEquals(newValue, result);
    }

}