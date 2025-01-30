package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertEquals("testVal1", attributes.get("testKey1"));
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertEquals("testVal1", attributes.getIgnoreCase("TESTKEY1"));
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("testKey2", "testVal2");
        assertEquals("testVal2", attributes.getUserData("testKey2"));
    }

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertEquals("testVal1", attributes.get("testKey1"));
    }

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("testKey1", "testVal1");
        assertEquals("testVal1", attributes.get("testKey1"));
    }

    @Test
    public void putUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("testKey2", "testVal2");
        assertEquals("testVal2", attributes.getUserData("testKey2"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("testKey3", "testVal3");
        attributes.put(attribute);
        assertTrue(attributes.hasKey("testKey3"));
    }

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        attributes.remove("testKey1");
        assertFalse(attributes.hasKey("testKey1"));
    }

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        attributes.removeIgnoreCase("TESTKEY1");
        assertFalse(attributes.hasKey("testKey1"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertTrue(attributes.hasKey("testKey1"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertTrue(attributes.hasKeyIgnoreCase("TESTKEY1"));
    }

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertTrue(attributes.hasDeclaredValueForKey("testKey1"));
    }

    @Test
    public void hasDeclaredValueForKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("TESTKEY1"));
    }

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertEquals(1, attributes.size());
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
        attributes1.add("testKey1", "testVal1");
        attributes2.add("testKey2", "testVal2");
        attributes1.addAll(attributes2);
        assertEquals(2, attributes1.size());
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        attributes.add("testKey2", "testVal2");
        assertEquals(2, attributes.asList().size());
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertEquals(" testKey1=\"testVal1\"", attributes.html());
    }

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.add("testKey1", "testVal1");
        attributes2.add("testKey1", "testVal1");
        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertNotNull(attributes.hashCode());
    }

    @Test
    public void cloneTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("testKey1", "testVal1");
        Attributes attributes2 = attributes1.clone();
        assertEquals(attributes1, attributes2);
    }

}