package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals("testValue", attrs.get("testKey"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals("testValue", attrs.getIgnoreCase("TESTKEY"));
    }

    @Test
    public void addTest() {
        Attributes attrs = new Attributes();
        attrs.add("testKey", "testValue");
        assertTrue(attrs.hasKey("testKey"));
    }

    @Test
    public void putTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertTrue(attrs.hasKey("testKey"));
    }

    @Test
    public void removeTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        attrs.remove("testKey");
        assertFalse(attrs.hasKey("testKey"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertTrue(attrs.hasKey("testKey"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertTrue(attrs.hasKeyIgnoreCase("TESTKEY"));
    }

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        attrs.put("testKey1", "testValue1");
        assertEquals(2, attrs.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());
        attrs.put("testKey", "testValue");
        assertFalse(attrs.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("testKey", "testValue");

        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");

        attrs1.addAll(attrs2);
        assertTrue(attrs1.hasKey("key"));
    }

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals(1, attrs.asList().size());
    }

    @Test
    public void datasetTest() {
        Attributes attrs = new Attributes();
        attrs.put("data-test", "testValue");
        assertTrue(attrs.dataset().containsKey("test"));
    }

    @Test
    public void htmlTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals(" testKey=\"testValue\"", attrs.html());
    }

    @Test
    public void toStringTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals(" testKey=\"testValue\"", attrs.toString());
    }

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("testKey", "testValue");

        Attributes attrs2 = new Attributes();
        attrs2.put("testKey", "testValue");

        assertEquals(attrs1, attrs2);
    }

    @Test
    public void cloneTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("testKey", "testValue");
        Attributes attrs2 = attrs1.clone();
        assertEquals(attrs1, attrs2);
    }

    @Test
    public void normalizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("TESTKEY", "testValue");
        attrs.normalize();
        assertTrue(attrs.hasKey("testkey"));
    }

}