package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

public class GeneratedTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertNull(attributes.getUserData("key"));

        attributes.putUserData("key", "data");
        Assert.assertEquals("data", attributes.getUserData("key"));
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
    public void putUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        Assert.assertEquals("value", attributes.getUserData("key"));
    }

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertTrue(attributes.hasKey("key"));

        attributes.put("key", false);
        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));

        attributes.remove("key");
        Assert.assertEquals("", attributes.get("key"));
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key", "value");
        Assert.assertEquals("value", attributes.get("Key"));

        attributes.removeIgnoreCase("key");
        Assert.assertEquals("", attributes.get("Key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        Assert.assertFalse(attributes.hasKey("key"));

        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        Assert.assertFalse(attributes.hasKeyIgnoreCase("key"));

        attributes.put("Key", "value");
        Assert.assertTrue(attributes.hasKeyIgnoreCase("key"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        Assert.assertEquals(0, attributes.size());

        attributes.put("key", "value");
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());

        attributes.put("key", "value");
        Assert.assertFalse(attributes.isEmpty());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        Attributes clone = attributes.clone();

        Assert.assertSame(attributes.get("key"), clone.get("key"));
        Assert.assertNotSame(attributes, clone);
    }

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        Assert.assertFalse(attributes.hasDeclaredValueForKey("key"));

        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key", "value");
        attributes.normalize();

        Assert.assertEquals("value", attributes.get("key"));
        Assert.assertFalse(attributes.hasKey("Key"));
    }

    @Test
    public void deduplicateTest() {
        ParseSettings settings = new ParseSettings(true, false);
        Attributes attributes = new Attributes();
        attributes.put("Key", "value1");
        attributes.put("key", "value2");

        int removed = attributes.deduplicate(settings);

        Assert.assertEquals(1, removed);
        Assert.assertEquals(1, attributes.size());
        Assert.assertTrue(attributes.hasKey("Key"));
        Assert.assertFalse(attributes.hasKey("key"));
    }

}