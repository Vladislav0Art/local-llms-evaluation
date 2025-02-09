package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedTest {

    @Test
    public void getValidKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void getInvalidKeyTest() {
        Attributes attrs = new Attributes();
        attrs.get("invalid");
    }

    @Test
    public void getIgnoreCaseValidKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.getIgnoreCase("KEY"));
    }

    @Test
    public void addKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void putKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void hasKeyPresentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
    }

    @Test
    public void hasKeyAbsentKeyTest() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void isEmptyNonEmptyAttributesTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertFalse(attrs.isEmpty());
    }

    @Test
    public void isEmptyEmptyAttributesTest() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());
    }

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Iterator<Attribute> iter = attrs.iterator();
        assertTrue(iter.hasNext());
    }

    @Test
    public void cloneEqualityTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = attrs1.clone();
        assertEquals(attrs1, attrs2);
    }

    @Test
    public void cloneInequalityTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = attrs1.clone();
        attrs2.put("key2", "value2");
        assertNotEquals(attrs1, attrs2);
    }

}