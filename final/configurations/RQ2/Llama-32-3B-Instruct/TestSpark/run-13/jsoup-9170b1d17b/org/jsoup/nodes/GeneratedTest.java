package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void getSingleKey() {
        Attributes attributes = new Attributes();
        assertEquals("key", attributes.get("key"));
    }

    @Test
    public void getIgnoreCaseSingleKey() {
        Attributes attributes = new Attributes();
        assertEquals("KEY", attributes.getIgnoreCase("key"));
    }

    @Test
    public void getUserData() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getUserData("key"));
    }

    @Test
    public void addAndGetSingleKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putAndGetSingleKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void putUserDataAndGetUserDataSingleKey() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        assertNull(attributes.getUserData("key"));
    }

    @Test
    public void removeSingleKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        assertTrue(!attributes.hasKey("key"));
    }

    @Test
    public void hasKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

    @Test
    public void putBooleanValueSingleKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertTrue(attributes.get("key").equals(Boolean.TRUE.toString()));
    }

    @Test
    public void sizeIsZero() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void isEmpty() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void addAllAttributes() {
        Attributes incoming1 = new Attributes();
        incoming1.add("key", "value");
        Attributes attributes = new Attributes();
        attributes.addAll(incoming1);
        assertEquals(1, attributes.size());
    }

    @Test
    public void iteratorReturnsOneElement() {
        Attribute attribute = new Attribute("attribute");
        when(attribute.toString()).thenReturn("attribute");
        Attributes attributes = new Attributes();
        Iterator<Attribute> iterator = attributes.iterator();
        assertEquals(1, java.util.Collections.frequency(Arrays.asList(iterator.next()), attribute));
    }

    @Test
    public void normalize() {
        // test case implementation depends on the implementation of normalize()
        // it may involve testing for correct handling of different input scenarios
    }

    @Test
    public void deduplicateParseSettings() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.deduplicate(new ParseSettings()));
    }
}

class Attribute {
    private String attribute;

    public Attribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return attribute;
    }
}

}