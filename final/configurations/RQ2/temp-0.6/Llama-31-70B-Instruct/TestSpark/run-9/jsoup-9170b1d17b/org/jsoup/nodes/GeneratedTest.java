package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Attributes attributes;

    @Test
    public void indexOfKeyTest() {
        when(attributes.indexOfKey("key1")).thenReturn(1);
        assertEquals(1, attributes.indexOfKey("key1"));
    }

    @Test
    public void checkNotNullTest() {
        String val = "test";
        String output = Attributes.checkNotNull(val);
        assertEquals("test", output);
    }

    @Test
    public void getTest() {
        when(attributes.get("key1")).thenReturn("value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void getIgnoreCaseTest() {
        when(attributes.getIgnoreCase("key1")).thenReturn("value1");
        assertEquals("value1", attributes.getIgnoreCase("key1"));
    }

    @Test
    public void getUserDataTest() {
        when(attributes.getUserData("key1")).thenReturn("value1");
        assertEquals("value1", attributes.getUserData("key1"));
    }

}