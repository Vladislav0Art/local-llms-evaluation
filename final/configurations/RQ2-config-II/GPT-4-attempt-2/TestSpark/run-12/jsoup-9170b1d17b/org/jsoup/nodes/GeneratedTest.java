package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void addKeyWithValueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putKeyWithValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        Assert.assertFalse(attributes.hasKey("key"));
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
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        Attributes newAttributes = new Attributes();
        newAttributes.add("key2", "value2");
        attributes.addAll(newAttributes);
        Assert.assertEquals(2, attributes.size());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        List<Attribute> list = attributes.asList();
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        String html = attributes.html();
        Assert.assertTrue(html.contains("key1=\"value1\""));
        Assert.assertTrue(html.contains("key2=\"value2\""));
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.add("key1", "value1");
        Assert.assertEquals(attributes1, attributes2);
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        Attributes clone = attributes.clone();
        Assert.assertEquals(attributes, clone);
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
        attributes.add("key", "value1");
        attributes.add("key", "value2");
        attributes.deduplicate(ParseSettings.preserveCase);
        Assert.assertEquals(1, attributes.size());
    }

}