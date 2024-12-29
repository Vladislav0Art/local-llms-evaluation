package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void indexOfKeyNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("non-existent"));
    }

    @Test
    public void indexOfKeyExistentKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("existent", "value");
        assertEquals(0, attributes.indexOfKey("existent"));
    }

    @Test
    public void getNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("non-existent"));
    }

    @Test
    public void getExistentKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("existent", "value");
        assertEquals("value", attributes.get("existent"));
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        assertEquals(0, attributes.size());
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey("key"));
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
    public void isNotEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
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
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("key", attributes.iterator().next().getKey());
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("key=\"value\"", attributes.html());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes cloned = attributes.clone();
        assertEquals(attributes, cloned);
    }

}