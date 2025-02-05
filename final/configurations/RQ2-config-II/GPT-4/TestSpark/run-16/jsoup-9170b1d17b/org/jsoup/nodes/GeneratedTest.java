package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getInvalidKeyTest() {
        Attributes attributes = new Attributes();
        Assert.assertNull(attributes.get("key"));
    }

    @Test
    public void putValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putAttributeTest() {
        Attribute attribute = new Attribute("key", "value");
        Attributes attributes = new Attributes();
        attributes.put(attribute);
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        Assert.assertNull(attributes.get("key"));
    }

    @Test
    public void removeNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        Assert.assertNull(attributes.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key2", "value2");
        Assert.assertEquals(2, attributes.size());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.add("data-key", "value");
        Map<String, String> dataset = attributes.dataset();
        Assert.assertEquals(1, dataset.size());
        Assert.assertTrue(dataset.containsKey("key"));
        Assert.assertEquals("value", dataset.get("key"));
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        Attributes clonedAttributes = attributes.clone();
        Assert.assertEquals(attributes, clonedAttributes);
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals(" key=\"value\"", attributes.html());
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        attributes.normalize();
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key", "newValue");
        attributes.deduplicate(ParseSettings.preserveCase);
        Assert.assertEquals("newValue", attributes.get("key"));
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        List<Attribute> attributesList = new ArrayList<>();
        attributesList.add(new Attribute("key", "value"));
        Assert.assertEquals(attributesList, attributes.asList());
    }

}