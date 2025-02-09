package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addValidKeyValueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void addNullValueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", null);
        assertEquals("", attributes.get("key"));
    }

    @Test
    public void putValidKeyValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        assertEquals(2, attributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        Attributes incomingAttributes = new Attributes();
        incomingAttributes.put("key", "value");
        attributes.addAll(incomingAttributes);
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clonedAttributes = attributes.clone();
        assertEquals(clonedAttributes.get("key"), attributes.get("key"));
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value1");
        attributes.add("key", "value2");
        ParseSettings settings = ParseSettings.htmlDefault;
        int deduplicateCount = attributes.deduplicate(settings);
        assertEquals(1, deduplicateCount);
    }

}