package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void putKeyValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putKeyValueIsNullTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "null");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void putKeyBooleanValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void removeKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void addKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());

        attributes.put("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();

        attributes1.put("key", "value");
        attributes2.put("key2", "value2");

        attributes1.addAll(attributes2);

        assertTrue(attributes1.hasKey("key2"));
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());

        Attribute attribute = iterator.next();
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        ArrayList<Attribute> list = (ArrayList<Attribute>) attributes.asList();

        Attribute attribute = list.get(0);
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");

        HashMap<String, String> dataset = (HashMap<String, String>) attributes.dataset();

        String dataValue = dataset.get("key");
        assertEquals("value", dataValue);
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();

        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void deduplicateWithSettingsTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.put("KEY", "value");

        ParseSettings settings = new ParseSettings(true, false);
        int deduplicated = attributes.deduplicate(settings);

        assertEquals(1, deduplicated);
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        Attributes clone = attributes.clone();

        assertNotEquals(System.identityHashCode(attributes), System.identityHashCode(clone));
        assertEquals(attributes, clone);
    }

    @Test
    public void equalsAndHashCodeTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();

        attributes1.put("key", "value");
        attributes2.put("key", "value");

        assertTrue(attributes1.equals(attributes2) && attributes2.equals(attributes1));
        assertEquals(attributes1.hashCode(), attributes2.hashCode());
    }

}