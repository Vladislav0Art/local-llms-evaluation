package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private Attributes attributes;

    @Test
    public void add_EmptyAttributes_AddsKeyAndValue() {
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void add_ExistingKey_OverwritesValue() {
        attributes.add("key", "oldValue");
        attributes.add("key", "newValue");
        assertEquals("newValue", attributes.get("key"));
    }

    @Test
    public void add_NullValue_AddsKeyWithNullValue() {
        attributes.add("key", null);
        assertEquals(1, attributes.size());
    }

    @Test
    public void put_EmptyAttributes_AddsKeyAndValue() {
        attributes.put("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void put_ExistingKey_OverwritesValue() {
        attributes.put("key", "oldValue");
        attributes.put("key", "newValue");
        assertEquals("newValue", attributes.get("key"));
    }

    @Test
    public void put_NullValue_AddsKeyWithNullValue() {
        attributes.put("key", null);
        assertEquals(1, attributes.size());
    }

    @Test
    public void putBoolean_EmptyAttributes_AddsKeyAndValue() {
        attributes.put("key", true);
        assertEquals(1, attributes.size());
    }

    @Test
    public void putBoolean_ExistingKey_OverwritesValue() {
        attributes.put("key", false);
        attributes.put("key", true);
        assertEquals(true, attributes.get("key"));
    }

    @Test
    public void putUserData_EmptyAttributes_AddsKeyAndValue() {
        attributes.putUserData("key", "value");
        assertEquals(1, attributes.size());
    }

}