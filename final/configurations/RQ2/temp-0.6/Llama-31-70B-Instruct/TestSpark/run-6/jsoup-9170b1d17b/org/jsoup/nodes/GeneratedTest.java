package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();

        int actualIndex = attributes.indexOfKey("key");

        assertEquals(0, actualIndex);
    }

    @Test
    public void checkNotNullTest() {
        Attributes attributes = new Attributes();

        String actualValue = attributes.checkNotNull(null);

        assertEquals("", actualValue);
    }

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        String actualValue = attributes.get("key");

        assertEquals("value", actualValue);
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        String actualValue = attributes.getIgnoreCase("key");

        assertEquals("value", actualValue);
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");

        Object actualValue = attributes.getUserData("key");

        assertEquals("value", actualValue);
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();

        Attributes actualAttributes = attributes.add("key", "value");

        assertEquals(attributes, actualAttributes);
    }

}