package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addAttributeTest() {
        Attributes attr = new Attributes();
        attr.add("key", "value");
        assertEquals("value", attr.get("key"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertEquals("value", attr.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertTrue(attr.hasKey("key"));
    }

    @Test
    public void removeAttributeTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        attr.remove("key");
        assertFalse(attr.hasKey("key"));
    }

    @Test
    public void iteratorTest() {
        Attributes attr = new Attributes();
        attr.put("key1", "value1");
        attr.put("key2", "value2");

        Iterator<Attribute> iterator = attr.iterator();
        assertNotNull(iterator);
    }

    @Test
    public void sizeTest() {
        Attributes attr = new Attributes();
        attr.put("key1", "value1");
        attr.put("key2", "value2");

        assertEquals(2, attr.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attr = new Attributes();
        assertTrue(attr.isEmpty());
    }

    @Test
    public void cloneTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        Attributes cloneAttr = attr.clone();

        assertEquals(cloneAttr, attr);
    }

    @Test
    public void equalsTest() {
        Attributes attr1 = new Attributes();
        attr1.put("key", "value");

        Attributes attr2 = new Attributes();
        attr2.put("key", "value");

        assertTrue(attr1.equals(attr2));
    }

    @Test
    public void hashCodeTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertNotEquals(0, attr.hashCode());
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertEquals("value", attr.getIgnoreCase("KEY"));
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        attr.removeIgnoreCase("KEY");
        assertFalse(attr.hasKey("key"));
    }

}