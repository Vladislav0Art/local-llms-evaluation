package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private Attributes attributes;

    @Test
    public void get_SetsKey_ReturnsValue() {
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void get_SetsKeyWithDifferentCase_ReturnsValue() {
        attributes.add("key", "value");
        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void get_KeyNotFound_ReturnsEmptyString() {
        assertEquals("", attributes.get("key"));
    }

    @Test
    public void getIgnoreCase_KeyNotFound_ReturnsEmptyString() {
        assertEquals("", attributes.getIgnoreCase("key"));
    }

    @Test
    public void getUserData_KeyNotFound_ReturnsNull() {
        assertEquals(null, attributes.getUserData("key"));
    }

    @Test
    public void getUserData_KeyFound_ReturnsValue() {
        attributes.add("key", "value");
        assertEquals("value", attributes.getUserData("key"));
    }

    @Test
    public void add_AddsKeyAndValue() {
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void add_DuplicateKey_UpdatesValue() {
        attributes.add("key", "value1");
        attributes.add("key", "value2");
        assertEquals("value2", attributes.get("key"));
    }

    @Test
    public void put_SetsKeyAndValue() {
        attributes.put("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void put_DuplicateKey_UpdatesValue() {
        attributes.put("key", "value1");
        attributes.put("key", "value2");
        assertEquals("value2", attributes.get("key"));
    }

}