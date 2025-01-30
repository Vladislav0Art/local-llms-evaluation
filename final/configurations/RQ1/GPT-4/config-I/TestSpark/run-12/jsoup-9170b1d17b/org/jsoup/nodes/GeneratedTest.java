package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedTest {

    @Test
    public void getNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.get("nonExistingKey");
        Assert.assertEquals("", result);
    }

    @Test
    public void getIgnoreCaseNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.getIgnoreCase("nonExistingKey");
        Assert.assertEquals("", result);
    }

    @Test
    public void addNewKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("newKey", "newValue");
        String result = attributes.get("newKey");
        Assert.assertEquals("newValue", result);
    }

    @Test
    public void putExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.put("key", "newValue");
        String result = attributes.get("key");
        Assert.assertEquals("newValue", result);
    }

    @Test
    public void removeExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        boolean result = attributes.hasKey("key");
        Assert.assertFalse(result);
    }

    @Test
    public void removeIgnoreCaseExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key", "value");
        attributes.removeIgnoreCase("key");
        boolean result = attributes.hasKeyIgnoreCase("Key");
        Assert.assertFalse(result);
    }

    @Test
    public void hasKeyExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        boolean result = attributes.hasKey("key");
        Assert.assertTrue(result);
    }

    @Test
    public void hasKeyIgnoreCaseExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key", "value");
        boolean result = attributes.hasKeyIgnoreCase("key");
        Assert.assertTrue(result);
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");

        attributes1.addAll(attributes2);
        boolean result = attributes1.hasKey("key2");
        Assert.assertTrue(result);
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();

        Assert.assertTrue(iterator.hasNext());
        Attribute attribute = iterator.next();
        Assert.assertEquals("key", attribute.getKey());
    }

    @Test
    public void iteratorNoSuchElementTest() {
        Attributes attributes = new Attributes();
        Iterator<Attribute> iterator = attributes.iterator();
        iterator.next();
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        int size = attributes.asList().size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String html = attributes.html();
        Assert.assertEquals("key=\"value\"", html);
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        attributes.normalize();
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

}