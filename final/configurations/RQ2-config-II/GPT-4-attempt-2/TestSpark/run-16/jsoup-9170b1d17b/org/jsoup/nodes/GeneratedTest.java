package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        assertEquals("value", attributes.getUserData("key"));
    }

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("KEY", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        assertNull(attributes.get("key"));
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.removeIgnoreCase("KEY");
        assertNull(attributes.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        assertEquals(2, attributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");
        attributes1.addAll(attributes2);
        assertEquals(2, attributes1.size());
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attribute attribute = attributes.iterator().next();
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attribute attribute = attributes.asList().get(0);
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes cloned = attributes.clone();
        assertEquals(attributes, cloned);
    }

    @Test
    public void putBooleanValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertEquals("", attributes.get("key"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String expected = " key=\"value\"";
        assertEquals(expected, attributes.toString());
    }

    @Test
    public void equalsEmptyTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        assertEquals(attributes1, attributes2);
    }

    @Test
    public void equalsNonEmptyTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.add("key", "value");

        assertEquals(attributes1, attributes2);
    }

}