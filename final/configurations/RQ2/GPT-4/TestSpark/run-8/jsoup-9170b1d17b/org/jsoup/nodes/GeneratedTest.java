package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static junit.framework.TestCase.*;

public class GeneratedTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        int index = attributes.indexOfKey("key1");
        assertEquals(0, index);
    }

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.getIgnoreCase("KEY1"));
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        assertTrue(attributes.hasKey("key1"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertTrue(attributes.hasKey("key1"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key1", "value1");
        attributes.put(attribute);
        assertTrue(attributes.hasKey("key1"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.remove("key1");
        assertFalse(attributes.hasKey("key1"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertTrue(attributes.hasKey("key1"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals(1, attributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.put("key2", "value2");
        attributes1.addAll(attributes2);
        assertTrue(attributes1.hasKey("key2"));
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertFalse(attributes.asList().isEmpty());
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertTrue(attributes.html().contains("key1"));
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.put("key1", "value1");
        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertNotNull(attributes.hashCode());
    }

    @Test
    public void cloneTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        Attributes attributes2 = attributes1.clone();
        assertEquals(attributes1, attributes2);
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY1", "value1");
        attributes.normalize();
        assertFalse(attributes.hasKey("KEY1"));
        assertTrue(attributes.hasKey("key1"));
    }

}