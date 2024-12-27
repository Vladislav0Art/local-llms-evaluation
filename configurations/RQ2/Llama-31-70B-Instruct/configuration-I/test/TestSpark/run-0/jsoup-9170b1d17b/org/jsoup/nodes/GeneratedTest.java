package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("key"));
    }

    @Test
    public void checkNotNullTest() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.checkNotNull(null));
    }

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("key"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getIgnoreCase("key"));
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getUserData("key"));
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        assertEquals(attributes, attributes.add("key", "value"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        assertEquals(attributes, attributes.put("key", "value"));
    }

    @Test
    public void putUserDataTest() {
        Attributes attributes = new Attributes();
        assertEquals(attributes, attributes.putUserData("key", "value"));
    }

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}