package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        String result = attributes.getIgnoreCase("key");
        Assert.assertEquals("value", result);
    }

    @Test
    public void getNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.getIgnoreCase("key");
        Assert.assertEquals("", result);
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "object");
        Object result = attributes.getUserData("key");
        Assert.assertEquals("object", result);
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putNullValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", null);
        Assert.assertEquals("", attributes.get("key"));
    }

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertEquals("true", attributes.get("key"));
    }

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        Assert.assertEquals("", attributes.get("key"));
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.removeIgnoreCase("KEY");
        Assert.assertEquals("", attributes.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        Assert.assertEquals(2, attributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");
        attributes1.addAll(attributes2);
        Assert.assertEquals(2, attributes1.size());
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();
        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        List<Attribute> attributesList = attributes.asList();
        Assert.assertEquals(1, attributesList.size());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Map<String, String> map = attributes.dataset();
        Assert.assertEquals("value", map.get("key"));
    }

    @Test
    public void htmlTest() throws IOException {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String html = attributes.html();
        Assert.assertEquals("key=\"value\" ", html);
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key", "value");
        Assert.assertEquals(attributes1, attributes2);
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes cloned = attributes.clone();
        Assert.assertEquals(attributes, cloned);
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("kEy1", "VaLuE1");
        attributes.normalize();
        Assert.assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key", "value");
        int deduplications = attributes.deduplicate(ParseSettings.preserveCase);
        Assert.assertEquals(1, deduplications);
    }

}