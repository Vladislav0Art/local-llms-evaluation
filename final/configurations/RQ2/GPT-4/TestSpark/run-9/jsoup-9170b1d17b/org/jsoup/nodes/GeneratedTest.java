package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        Assert.assertEquals("", attributes.get("key"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void addAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putBooleanAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertEquals("true", attributes.get("key"));
    }

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();
        Assert.assertEquals("key", iterator.next().getKey());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        List<Attribute> list = attributes.asList();
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("key", list.get(0).getKey());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Map<String, String> dataset = attributes.dataset();
        Assert.assertEquals(0, dataset.size());
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("key=\"value\"", attributes.html().trim());
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");
        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");
        Assert.assertEquals(attributes1, attributes2);
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertNotEquals(0, attributes.hashCode());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clone = attributes.clone();
        Assert.assertEquals(attributes, clone);
    }

}