package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.jsoup.safety.Whitelist;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testIndexOfKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        int indexOfKey = attributes.indexOfKey("key");
        assertEquals(0, indexOfKey);
    }

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        String value = attributes.checkNotNull(null);
        assertEquals("", value);
    }

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String value = attributes.get("key");
        assertEquals("value", value);
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String value = attributes.getIgnoreCase("Key");
        assertEquals("value", value);
    }

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        Object userData = attributes.getUserData("key");
        assertEquals("value", userData);
    }

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
        assertTrue(attributes.hasKey("key"));
    }

}