package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.get("key");
        Assert.assertEquals("value", value);
    }

    @Test
    public void getInvalidKeyTest() {
        Attributes attributes = new Attributes();
        String value = attributes.get("invalidKey");
        Assert.assertEquals("", value);
    }

    @Test
    public void putNewAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.get("key");
        Assert.assertEquals("value", value);
    }

    @Test
    public void putExistingAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.put("key", "newValue");
        String value = attributes.get("key");
        Assert.assertEquals("newValue", value);
    }

    @Test
    public void putNullKeyTest() {
        Attributes attributes = new Attributes();
        try {
            attributes.put(null, "value");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Key must not be null", e.getMessage());
        }
    }

    @Test
    public void removeExistingAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        String value = attributes.get("key");
        Assert.assertEquals("", value);
    }

    @Test
    public void removeNonExistingAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        String value = attributes.get("key");
        Assert.assertEquals("", value);
    }

    @Test
    public void checkHasKeyExistsTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void checkHasKeyDoesNotExistTest() {
        Attributes attributes = new Attributes();
        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void checkSizeWhenEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void checkSizeWhenNotEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void checkIsEmptyWhenEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

    @Test
    public void checkIsEmptyWhenNotEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertFalse(attributes.isEmpty());
    }

    @Test
    public void checkCloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes cloneAttributes = attributes.clone();
        assertEquals(attributes, cloneAttributes);
    }

    @Test
    public void htmlOutputTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String html = attributes.html();
        assertEquals("key=\"value\"", html);
    }

    @Test
    public void checkSizeAfterAddAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.put("key2", "value2");

        attributes1.addAll(attributes2);

        Assert.assertEquals(2, attributes1.size());
        assertEquals("value1", attributes1.get("key1"));
        assertEquals("value2", attributes1.get("key2"));
    }

    @Test
    public void checkRemoveIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.removeIgnoreCase("KEY");
        assertEquals("", attributes.get("key"));
    }

}