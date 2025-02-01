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
        attributes.add("key", "value");
        String actual = attributes.get("key");

        assertEquals("value", actual);
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        String actual = attributes.getIgnoreCase("key");

        assertEquals("value", actual);
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String actual = attributes.get("key");

        assertEquals("value", actual);
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");

        assertEquals(0, attributes.size());
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        attributes.removeIgnoreCase("key");

        assertEquals(0, attributes.size());
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        assertTrue(attributes.hasKey("key"));
        assertFalse(attributes.hasKey("unavailableKey"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");

        assertTrue(attributes.hasKeyIgnoreCase("key"));
        assertFalse(attributes.hasKeyIgnoreCase("unavailableKey"));
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        List<Attribute> list = attributes.asList();

        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals("key", list.get(0).getKey());
        assertEquals("value", list.get(0).getValue());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-test", "value");

        Map<String, String> dataSet = attributes.dataset();

        assertNotNull(dataSet);
        assertEquals(1, dataSet.size());
        assertEquals("value", dataSet.get("test"));
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();

        assertTrue(iterator.hasNext());

        Attribute attribute1 = iterator.next();
        assertEquals("key1", attribute1.getKey());
        assertEquals("value1", attribute1.getValue());

        Attribute attribute2 = iterator.next();
        assertEquals("key2", attribute2.getKey());
        assertEquals("value2", attribute2.getValue());

        assertFalse(iterator.hasNext());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes clonedAttributes = attributes.clone();
        attributes.remove("key");

        assertTrue(clonedAttributes.hasKey("key"));
        assertFalse(attributes.hasKey("key"));
    }

}