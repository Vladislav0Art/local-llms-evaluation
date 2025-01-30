package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        assertTrue(attributes.hasKey("key"));
        assertEquals(1, attributes.size());
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value1");
        attributes.put("key", "value2");

        assertTrue(attributes.hasKey("key"));
        assertEquals(1, attributes.size());
        assertEquals("value2", attributes.get("key"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");

        assertFalse(attributes.hasKey("key"));
        assertEquals(0, attributes.size());
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());

        attributes.put("key1", "value1");
        assertEquals(1, attributes.size());

        attributes.put("key2", "value2");
        assertEquals(2, attributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());

        attributes.put("key", "value");
        assertFalse(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.put("key2", "value2");

        attributes1.addAll(attributes2);

        assertTrue(attributes1.hasKey("key1"));
        assertTrue(attributes1.hasKey("key2"));
        assertEquals(2, attributes1.size());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");

        List<Attribute> list = attributes.asList();

        assertEquals(2, list.size());
        assertEquals("value1", list.get(0).getValue());
        assertEquals("value2", list.get(1).getValue());
    }

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        String attributesString = attributes.toString();
        assertTrue(attributesString.contains("key"));
        assertTrue(attributesString.contains("value"));
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");

        assertEquals(attributes1.hashCode(), attributes2.hashCode());
    }

    @Test
    public void cloneTest() {
        Attributes original = new Attributes();
        original.add("key", "value");

        Attributes cloned = original.clone();

        assertEquals(cloned, original);
        assertNotSame(cloned, original);
    }

}