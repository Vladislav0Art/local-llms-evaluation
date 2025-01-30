package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedTest {

    @Test
    public void getExistingKeyTest() {
        final String key = "key";
        final String value = "value";
        final Attributes attributes = new Attributes();
        attributes.add(key, value);

        final String result = attributes.get(key);
        Assert.assertEquals(value, result);
    }

    @Test
    public void getNotExistingKeyTest() {
        final String key = "key";
        final Attributes attributes = new Attributes();

        final String result = attributes.get(key);
        Assert.assertEquals("", result);
    }

    @Test
    public void addKeyAndValueTest() {
        final String key = "key";
        final String value = "value";
        final Attributes attributes = new Attributes();

        attributes.add(key, value);

        final String result = attributes.get(key);
        Assert.assertEquals(value, result);
    }

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

    @Test
    public void removeExistingKeyTest() {
        final String key = "key";
        final Attributes attributes = new Attributes();
        attributes.add(key, "value");

        attributes.remove(key);

        Assert.assertFalse(attributes.hasKey(key));
    }

    @Test
    public void emptyIteratorTest() {
        final Attributes attributes = new Attributes();
        final Iterator<Attribute> iterator = attributes.iterator();
        iterator.next();
    }

}