package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNormalUseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.get("key");
        Assert.assertEquals("value", value);
    }

    @Test
    public void getMissingKeyTest() {
        Attributes attributes = new Attributes();
        String value = attributes.get("missingKey");
        Assert.assertEquals("", value);
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.getIgnoreCase("KEY");
        Assert.assertEquals("value", value);
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
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void removeIgnoreCaseAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.removeIgnoreCase("KEY");
        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

    @Test
    public void hasDeclaredValueForKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("KEY"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
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
        attributes1.put("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.put("key2", "value2");

        attributes1.addAll(attributes2);
        Assert.assertEquals(2, attributes1.size());
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String html = attributes.html();
        Assert.assertEquals("key=\"value\"", html);
    }

    @Test
    public void equalTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");

        Assert.assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clonedAttributes = attributes.clone();
        Assert.assertTrue(attributes.equals(clonedAttributes));
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value1");
        attributes.add("key", "value2");
        int numDuplicates = attributes.deduplicate(ParseSettings.htmlDefault);
        Assert.assertEquals(1, numDuplicates);
    }

    @Test
    public void putBooleanAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");
        Assert.assertTrue(attributes.dataset().containsKey("key"));
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attribute attribute = attributes.iterator().next();
        Assert.assertEquals("key", attribute.getKey());
        Assert.assertEquals("value", attribute.getValue());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attribute attribute = attributes.asList().get(0);
        Assert.assertEquals("key", attribute.getKey());
        Assert.assertEquals("value", attribute.getValue());
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        Assert.assertTrue(attributes.hasKey("key"));
    }

}