package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = new Attributes();
    }

    @Test
    public void testIndexOfKey() {
        assertEquals(-1, attributes.indexOfKey("key"));
    }

    @Test
    public void testCheckNotNull() {
        assertNull(attributes.checkNotNull(null));
    }

    @Test
    public void testGet() {
        assertNull(attributes.get("key"));
    }

    @Test
    public void testGetIgnoreCase() {
        assertNull(attributes.getIgnoreCase("key"));
    }

    @Test
    public void testGetUserData() {
        assertNull(attributes.getUserData("key"));
    }

    @Test
    public void testAdd() {
        assertEquals(attributes, attributes.add("key", "value"));
    }

    @Test
    public void testPut() {
        assertEquals(attributes, attributes.put("key", "value"));
    }

    @Test
    public void testPutUserData() {
        assertEquals(attributes, attributes.putUserData("key", "value"));
    }

    @Test
    public void testPutIgnoreCase() {
        attributes.putIgnoreCase("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}