package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals(0, attributes.indexOfKey("key"));
    }

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        Attributes newAttributes = attributes.add("key", "value");
        Assert.assertEquals("value", newAttributes.get("key"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        Attributes newAttributes = attributes.put("key", "value");
        Assert.assertEquals("value", newAttributes.get("key"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        Attributes newAttributes = attributes.put(attribute);
        Assert.assertEquals("value", newAttributes.get("key"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        Assert.assertNull(attributes.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
        Assert.assertFalse(attributes.hasKey("nonExistentKey"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
        attributes.add("key", "value");
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        Attributes newAttributes = new Attributes();
        newAttributes.add("key1", "value1");
        attributes.addAll(newAttributes);
        Assert.assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void equalsTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes newAttributes = new Attributes();
        newAttributes.add("key", "value");
        Assert.assertEquals(attributes, newAttributes);
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes cloneAttributes = attributes.clone();
        Assert.assertEquals(attributes, cloneAttributes);
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        attributes.normalize();
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key", "value");
        Assert.assertEquals(2, attributes.size());
        attributes.deduplicate(new ParseSettings(true, true));
        Assert.assertEquals(1, attributes.size());
    }

}