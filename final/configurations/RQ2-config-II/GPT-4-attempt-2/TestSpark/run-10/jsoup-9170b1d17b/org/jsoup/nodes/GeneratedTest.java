package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

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
    public void removeTest() {
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
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.addAll(attributes1);

        Assert.assertTrue(attributes2.hasKey("key"));
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        Assert.assertEquals("key=value", attributes.asList().get(0).toString());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");

        Assert.assertEquals("value", attributes.dataset().get("key"));
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("key=\"value\"", attributes.html());
    }

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("key=\"value\"", attributes.toString());
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");

        Assert.assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        int expectedHashCode = attributes.hashCode();
        attributes.put("key", "value1");

        Assert.assertNotEquals(expectedHashCode, attributes.hashCode());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes attributesClone = attributes.clone();

        Assert.assertEquals(attributes.html(), attributesClone.html());
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key", "value");
        attributes.removeIgnoreCase("key");

        Assert.assertFalse(attributes.hasKey("Key"));
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");

        attributes.normalize();
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void attributePutTest() {
        Attribute attribute = new Attribute("key", "value");
        Attributes attributes = new Attributes();
        attributes.put(attribute);

        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);

        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.put("KEY", "value");
        ParseSettings settings = new ParseSettings(true, true);
        attributes.deduplicate(settings);

        Assert.assertEquals(1, attributes.size());
    }

}