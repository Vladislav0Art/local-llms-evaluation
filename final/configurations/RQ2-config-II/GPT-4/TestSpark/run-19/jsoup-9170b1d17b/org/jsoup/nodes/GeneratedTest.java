package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedTest {

    @Test
    public void addKeyAndValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        String actualValue = attrs.get("key");
        assertEquals("value", actualValue);
    }

    @Test
    public void putKeyAndValueTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        String actualValue = attrs.get("key");
        assertEquals("value", actualValue);
    }

    @Test
    public void getUserDataTest() {
        Attributes attrs = new Attributes();
        attrs.putUserData("key", "value");
        Object actualValue = attrs.getUserData("key");
        assertEquals("value", actualValue);
    }

    @Test
    public void removeKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKey("key"));
        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
        attrs.put("key1", "value");
        attrs.put("key2", "value");
        assertEquals(2, attrs.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());
        attrs.put("key", "value");
        assertFalse(attrs.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");
        attrs1.addAll(attrs2);
        assertTrue(attrs1.hasKey("key1"));
        assertTrue(attrs1.hasKey("key2"));
    }

    @Test
    public void hashCodeEqualsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        assertTrue(attrs1.equals(attrs2));
        assertEquals(attrs1.hashCode(), attrs2.hashCode());
    }

    @Test
    public void keysIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        assertTrue(attrs.hasKeyIgnoreCase("key"));
        assertEquals("value", attrs.getIgnoreCase("key"));
        attrs.removeIgnoreCase("key");
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void mergeSameKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key1", "value2");
        assertEquals(1, attributes.size());
        assertEquals("value2", attributes.get("key1"));
    }

    @Test
    public void toStingTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        assertEquals("key1=\"value1\"", attributes.toString());
    }

    @Test
    public void cloneTest() {
        Attributes attributesOriginal = new Attributes();
        attributesOriginal.add("key1", "value1");
        Attributes attributesClone = attributesOriginal.clone();
        assertEquals(attributesOriginal, attributesClone);
        assertNotSame(attributesOriginal, attributesClone);
    }

}