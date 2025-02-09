package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        String result = attributes.get("key");
        Assert.assertEquals("", result);
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.put("key1", "value1");
        attributes2.put("key2", "value2");
        attributes1.addAll(attributes2);
        Assert.assertEquals(2, attributes1.size());
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        Assert.assertEquals(2, attributes.size());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clone = attributes.clone();
        Assert.assertEquals(clone, attributes);
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value1");
        attributes.put("key", "value2");
        ParseSettings settings = new ParseSettings(true, true);
        Assert.assertEquals(1, attributes.deduplicate(settings));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        Assert.assertTrue(attributes.hasKeyIgnoreCase("key"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        String result = attributes.getIgnoreCase("key");
        Assert.assertEquals("value", result);
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

}