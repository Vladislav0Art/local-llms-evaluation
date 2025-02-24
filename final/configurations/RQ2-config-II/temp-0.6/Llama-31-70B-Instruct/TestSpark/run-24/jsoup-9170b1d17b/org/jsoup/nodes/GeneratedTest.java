package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        assertEquals("testValue", attributes.getIgnoreCase("TESTKEY"));
    }

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("testKey", "testValue");
        assertEquals("testValue", attributes.getUserData("testKey"));
    }

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("testKey", "testValue");
        assertEquals("testValue", attributes.getUserData("testKey"));
    }

    @Test
    public void testPutIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

    @Test
    public void testPutBoolean() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", true);
        assertEquals("", attributes.get("testKey"));
    }

}