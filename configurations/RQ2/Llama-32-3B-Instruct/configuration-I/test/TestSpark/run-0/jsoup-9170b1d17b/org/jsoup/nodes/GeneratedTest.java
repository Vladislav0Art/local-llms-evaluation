package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void get_emptyString() {
        Attributes attributes = new Attributes();
        String result = attributes.get("");
        assertTrue(result.isEmpty());
    }

    @Test
    public void get_singleKey() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        String result = attributes.get(attribute.getKey());
        assertEquals(attribute.getValue(), result);
    }

    @Test
    public void getIgnoreCase_emptyString() {
        Attributes attributes = new Attributes();
        String result = attributes.getIgnoreCase("");
        assertTrue(result.isEmpty());
    }

    @Test
    public void getIgnoreCase_singleKey() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        String result = attributes.getIgnoreCase(attribute.getKey());
        assertEquals(attribute.getValue(), result);
    }

    @Test
    public void getUserData_emptyString() {
        Attributes attributes = new Attributes();
        Object result = attributes.getUserData("");
        assertNull(result);
    }

    @Test
    public void getUserData_singleKey() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        Object result = attributes.getUserData(attribute.getKey());
        assertEquals(attribute.getValue(), result);
    }

    @Test
    public void add_newAttribute() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        assertTrue(attributes.hasKey(attribute.getKey()));
    }

    @Test
    public void put_singleKey() {
        Attributes attributes = new Attributes();
        String value = "newValue";
        attributes.put("key", value);
        assertEquals(value, attributes.get("key"));
    }

    @Test
    public void addAll_emptyAttributes() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.addAll(attributes2);
        assertTrue(attributes1.isEmpty());
    }

    @Test
    public void addAll_nonEmptyAttributes() {
        Attributes attributes1 = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes1.add(attribute.getKey(), attribute.getValue());
        Attributes attributes2 = new Attributes();
        attribute = new Attribute("otherKey", "otherValue");
        attributes2.add(attribute.getKey(), attribute.getValue());
        Attributes result = new Attributes();
        result.addAll(attributes1);
        result.addAll(attributes2);
        assertTrue(result.hasKey(attribute.getKey()));
    }

    @Test
    public void hasKey_emptyString() {
        Attributes attributes = new Attributes();
        String key = "";
        assertFalse(attributes.hasKey(key));
    }

    @Test
    public void hasKey_singleKey() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        assertTrue(attributes.hasKey(attribute.getKey()));
    }

    @Test
    public void get_sizeZero() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void isEmpty_emptyAttributes() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void hasDeclaredValueForKey_emptyString() {
        Attributes attributes = new Attributes();
        String key = "";
        assertFalse(attributes.hasDeclaredValueForKey(key));
    }

    @Test
    public void hasDeclaredValueForKey_singleKey() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        assertTrue(attributes.hasDeclaredValueForKey(attribute.getKey()));
    }

    @Test
    public void put_singleKey() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}