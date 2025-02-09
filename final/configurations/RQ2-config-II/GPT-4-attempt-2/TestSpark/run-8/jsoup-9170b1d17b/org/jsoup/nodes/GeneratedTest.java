package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getExistKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getNotExistKeyTest() {
        Attributes attributes = new Attributes();
        attributes.get("not_exist_key");
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key", "value");
        assertEquals("value", attributes.getIgnoreCase("key"));
    }

    @Test
    public void putNewKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("newKey", "newVal");
        assertEquals("newVal", attributes.get("newKey"));
    }

    @Test
    public void putExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("existing_key", "old_value");
        attributes.put("existing_key", "new_value");
        assertEquals("new_value", attributes.get("existing_key"));
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();

        attributes1.add("key1", "value1");
        attributes1.add("key2", "value2");
        attributes2.add("key3", "value3");

        attributes1.addAll(attributes2);
        assertTrue(attributes1.hasKey("key3"));
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();

        assertTrue(iterator.hasNext());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        List<Attribute> list = attributes.asList();
        assertEquals(1, list.size());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
    }

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String string = attributes.toString();
        assertTrue(string.contains("key=\"value\""));
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Attributes clonedAttributes = attributes.clone();
        assertEquals(attributes, clonedAttributes);
    }

}