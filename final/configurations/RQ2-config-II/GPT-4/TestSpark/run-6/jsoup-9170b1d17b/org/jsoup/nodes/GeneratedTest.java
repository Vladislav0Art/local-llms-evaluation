package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");

        assertEquals(1, attributes.size());
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", false);
        Attribute attribute = new Attribute(Tag.valueOf("key3"), "value3");
        attributes.put(attribute);

        assertEquals(3, attributes.size());
        assertEquals("value1", attributes.get("key1"));
        assertEquals("", attributes.get("key2"));
        assertEquals("value3", attributes.get("key3"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.remove("key1");

        assertEquals(0, attributes.size());
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");

        assertTrue(attributes.hasKey("key1"));
        assertFalse(attributes.hasKey("key2"));
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

        attributes.add("key1", "value1");
        assertFalse(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");

        attributes1.addAll(attributes2);

        assertEquals(2, attributes1.size());
        assertEquals("value2", attributes1.get("key2"));
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("key1", "value1");

        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");

        Attributes cloned = attributes.clone();

        assertEquals(attributes, cloned);
        assertNotSame(attributes, cloned);
    }

}