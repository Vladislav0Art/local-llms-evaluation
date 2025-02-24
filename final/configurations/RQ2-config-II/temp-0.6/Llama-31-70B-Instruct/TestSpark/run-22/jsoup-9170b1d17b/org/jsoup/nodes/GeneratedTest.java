package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("key1"));

        attributes.put("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getIgnoreCase("key1"));

        attributes.put("key1", "value1");
        assertEquals("value1", attributes.getIgnoreCase("Key1"));
    }

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());

        attributes.add("key1", "value1");
        assertEquals(1, attributes.size());
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());

        attributes.put("key1", "value1");
        assertEquals(1, attributes.size());
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("key1"));

        attributes.putUserData("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void testPutIgnoreCase() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getIgnoreCase("key1"));

        attributes.putIgnoreCase("Key1", "value1");
        assertEquals("value1", attributes.getIgnoreCase("key1"));
    }

}