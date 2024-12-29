package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = new Attributes();
    }

    @After
    public void tearDown() {
        attributes = null;
    }

    @Test
    public void indexOfKeyTest() {
        int expected = 0;
        int actual = attributes.indexOfKey("key");
        assertEquals(expected, actual);
    }

    @Test
    public void checkNotNullTest() {
        String expected = "value";
        String actual = Attributes.checkNotNull("value");
        assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        String expected = "value";
        String actual = attributes.get("key");
        assertEquals(expected, actual);
    }

    @Test
    public void getIgnoreCaseTest() {
        String expected = "value";
        String actual = attributes.getIgnoreCase("key");
        assertEquals(expected, actual);
    }

    @Test
    public void getUserDataTest() {
        Object expected = new Object();
        Object actual = attributes.getUserData("key");
        assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        Attributes expected = attributes;
        Attributes actual = attributes.add("key", "value");
        assertEquals(expected, actual);
    }

    @Test
    public void putTest() {
        Attributes expected = attributes;
        Attributes actual = attributes.put("key", "value");
        assertEquals(expected, actual);
    }

}