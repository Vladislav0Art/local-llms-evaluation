package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.get("nonExistingKey");
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void removeExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void removeNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.remove("nonExistingKey");
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        int expectedHashCode = attributes.hashCode();
        Assert.assertEquals(expectedHashCode, attributes.hashCode());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clonedAttributes = attributes.clone();
        Assert.assertEquals(attributes, clonedAttributes);
    }

    @Test
    public void isEmptyTest_emptyAttributes() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

    @Test
    public void isEmptyTest_nonEmptyAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertFalse(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributesA = new Attributes();
        Attributes attributesB = new Attributes();

        attributesA.put("key1", "value1");
        attributesB.put("key2", "value2");

        attributesA.addAll(attributesB);

        Assert.assertEquals(2, attributesA.size());
        Assert.assertTrue(attributesA.hasKey("key1"));
        Assert.assertTrue(attributesA.hasKey("key2"));
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        Attribute attribute1 = new Attribute("key1", "value1");
        Attribute attribute2 = new Attribute("key2", "value2");

        attributes.add("key1", "value1");
        attributes.add("key2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("key1=value1", iterator.next().toString());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("key2=value2", iterator.next().toString());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        Attribute attribute1 = new Attribute("key1", "value1");
        Attribute attribute2 = new Attribute("key2", "value2");

        attributes.put(attribute1);
        attributes.put(attribute2);

        List<Attribute> attributeList = attributes.asList();
        Assert.assertTrue(attributeList.contains(attribute1));
        Assert.assertTrue(attributeList.contains(attribute2));
    }

    @Test
    public void htmlTest() throws IOException {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");

        String expectedHtml = "key1=\"value1\" key2=\"value2\"";
        Assert.assertEquals(expectedHtml, attributes.html());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");
        Map<String, String> data = attributes.dataset();
        Assert.assertEquals(data.size(), 1);
        Assert.assertEquals("value", data.get("key"));
    }

    @Test
    public void putBooleanValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertFalse(attributes.hasDeclaredValueForKey("key"));
    }

}