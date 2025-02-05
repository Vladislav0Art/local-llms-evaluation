package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addKeyWithValueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void putKeyWithValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.remove("key1");
        assertNull(attributes.get("key1"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertTrue(attributes.hasKey("key1"));
        assertFalse(attributes.hasKey("key2"));
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
        attributes.put("key1", "value1");
        assertFalse(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.put("key2", "value2");
        attributes1.addAll(attributes2);
        assertEquals(2, attributes1.size());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        assertEquals(2, attributes.asList().size());
    }

    @Test
    public void jsonTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertNotNull(attributes.dataset());
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertNotNull(attributes.html());
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
    public void cloneTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        Attributes attributes2 = attributes1.clone();

        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("kEY1", "value1");
        attributes.normalize();

        assertTrue(attributes.hasKey("key1"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("kEY1", "value1");
        attributes.put("kEY1", "value2");
        int duplicates = attributes.deduplicate(null);

        assertEquals(1, duplicates);
        assertEquals("value2", attributes.get("key1"));
    }

}