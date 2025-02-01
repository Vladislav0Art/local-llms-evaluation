package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        Assert.assertEquals("", attributes.get("key"));
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
        attributes.add("key1", "value");
        attributes.add("key2", "value");
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
        attributes1.add("key1", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value");
        attributes1.addAll(attributes2);
        Assert.assertEquals(2, attributes1.size());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes clonedAttributes = attributes.clone();
        Assert.assertEquals(clonedAttributes.get("key"), attributes.get("key"));
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        int hashCode = attributes.hashCode();
        Assert.assertEquals(hashCode, attributes.hashCode());
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key", "value");
        Assert.assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String attr = attributes.toString();
        Assert.assertEquals(" key=\"value\"", attr);
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.putIgnoreCase("KEY", "value");
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.removeIgnoreCase("KEY");
        Assert.assertEquals("", attributes.get("key"));
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
        attributes.add("key", "anotherValue");
        attributes.deduplicate(ParseSettings.htmlDefault);
        Assert.assertEquals(1, attributes.size());
    }

}