package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("key"));
        attributes.put("key", "value");
        assertEquals(0, attributes.indexOfKey("key"));
    }

    @Test
    public void checkNotNullTest() {
        assertEquals("", Attributes.checkNotNull(null));
        assertEquals("value", Attributes.checkNotNull("value"));
    }

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
        assertNull(attributes.get("otherKey"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.getIgnoreCase("KEY"));
        assertNull(attributes.getIgnoreCase("otherKey"));
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getUserData("key"));
        attributes.putUserData("key", "value");
        assertEquals("value", attributes.getUserData("key"));
    }

}