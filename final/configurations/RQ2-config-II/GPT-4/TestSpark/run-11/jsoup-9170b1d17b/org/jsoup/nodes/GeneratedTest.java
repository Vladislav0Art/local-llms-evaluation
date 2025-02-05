package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addKeyAndValueTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");

        assertEquals("value", testAttributes.get("key"));
    }

    @Test
    public void putKeyAndValueTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.put("key1", "value1");

        assertEquals("value1", testAttributes.get("key1"));
    }

    @Test
    public void removeKeyTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        testAttributes.remove("key");

        assertEquals("", testAttributes.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");

        assertTrue(testAttributes.hasKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key1", "value1");
        testAttributes.add("key2", "value2");

        assertEquals(2, testAttributes.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes testAttributes = new Attributes();

        assertTrue(testAttributes.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes testAttributes = new Attributes();
        Attributes newAttributes = new Attributes();
        newAttributes.add("key", "value");
        testAttributes.addAll(newAttributes);

        assertTrue(testAttributes.hasKey("key"));
    }

    @Test
    public void iteratorTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        Iterator<Attribute> iterator = testAttributes.iterator();

        assertTrue(iterator.hasNext());
    }

    @Test
    public void equalsTest() {
        Attributes testAttributes1 = new Attributes();
        Attributes testAttributes2 = new Attributes();
        testAttributes1.add("key", "value");
        testAttributes2.add("key", "value");

        assertTrue(testAttributes1.equals(testAttributes2));
    }

    @Test
    public void hashCodeTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        int expectedHash = testAttributes.hashCode();

        assertEquals(expectedHash, testAttributes.hashCode());
    }

    @Test
    public void cloneTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        Attributes clonedAttributes = testAttributes.clone();

        assertEquals(testAttributes, clonedAttributes);
    }

}