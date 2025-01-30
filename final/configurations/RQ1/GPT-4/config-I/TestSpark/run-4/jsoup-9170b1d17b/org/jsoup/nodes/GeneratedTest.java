package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getMissingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.get("missing-key");
        assertEquals("", result);
    }

    @Test
    public void getExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String result = attributes.get("key");
        assertEquals("value", result);
    }

    @Test
    public void addAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void putAttributeValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void removeKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        assertEquals(false, attributes.hasKey("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        boolean hasKey = attributes.hasKey("key");
        assertEquals(true, hasKey);
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clone = attributes.clone();
        assertEquals(attributes.get("key"), clone.get("key"));
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.put("key", "value");
        attributes2.put("key", "value");
        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.add("key1", "value1");
        attributes2.add("key2", "value2");
        attributes1.addAll(attributes2);
        assertEquals(2, attributes1.size());
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put(new Attribute("key", "value"));
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        int expected = 31 * 31 * 1 + attributes.get("key").hashCode();
        assertEquals(expected, attributes.hashCode());
    }

}