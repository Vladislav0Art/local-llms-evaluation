package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        Attributes returnedAttributes = attributes.add("key", "value");

        assertEquals(attributes, returnedAttributes);
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        Attributes returnedAttributes = attributes.put("key", "value");

        assertEquals(attributes, returnedAttributes);
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        Attributes returnedAttributes = attributes.put(attribute);

        assertEquals(attributes, returnedAttributes);
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");

        assertNull(attributes.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();

        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        attributes.put("key3", "value3");

        assertEquals(3, attributes.size());
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
        Attributes attributes2 = new Attributes();

        attributes1.put("key1", "value1");
        attributes2.put("key2", "value2");
        attributes1.addAll(attributes2);

        assertEquals(2, attributes1.size());
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();

        assertTrue(iterator.hasNext());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        List<Attribute> list = attributes.asList();

        assertEquals(1, list.size());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");

        Map<String, String> map = attributes.dataset();

        assertEquals(1, map.size());
        assertTrue(map.containsKey("key"));
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testToString() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");

        String expected = "key1=\"value1\" key2=\"value2\" ";
        assertEquals(expected, attributes.toString());
    }

    @Test
    public void testEquals() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");

        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void testHtml() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        String expected = "key=\"value\" ";
        assertEquals(expected, attributes.html());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        Attributes cloned = attributes.clone();

        assertEquals(attributes, cloned);
        assertNotSame(attributes, cloned);
    }

    @Test
    public void testHashCode() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");

        assertEquals(attributes1.hashCode(), attributes2.hashCode());
    }

}