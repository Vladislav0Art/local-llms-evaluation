package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private Attributes attributes;

    @Before
    public void setup() {
        attributes = new Attributes();
    }

    @Test
    public void indexOfKeyTest() {
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        attributes.add("key3", "value3");

        assertEquals(2, attributes.indexOfKey("key3"));
    }

    @Test
    public void checkNotNullTest() {
        assertEquals("", Attributes.checkNotNull(null));
        assertEquals("value", Attributes.checkNotNull("value"));
    }

    @Test
    public void getTest() {
        attributes.add("key1", "value1");

        assertEquals("value1", attributes.get("key1"));
        assertNull(attributes.get("key2"));
    }

    @Test
    public void getIgnoreCaseTest() {
        attributes.add("key1", "value1");

        assertEquals("value1", attributes.getIgnoreCase("key1"));
        assertEquals("value1", attributes.getIgnoreCase("Key1"));
        assertNull(attributes.getIgnoreCase("key2"));
    }

    @Test
    public void getUserDataTest() {
        attributes.putUserData("key1", "value1");

        assertEquals("value1", attributes.getUserData("key1"));
        assertNull(attributes.getUserData("key2"));
    }

    @Test
    public void addTest() {
        attributes.add("key1", "value1");

        assertEquals("value1", attributes.get("key1"));
    }

}