package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    @Test
    public void get() {
        Attributes attributes = new Attributes();
        assertEquals("test", attributes.get("test"));
    }

    @Test
    public void getIgnoreCase() {
        Attributes attributes = new Attributes();
        assertEquals("test", attributes.getIgnoreCase("tesT"));
    }

    @Test
    public void getUserData() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getUserData("test"));
    }

    @Test
    public void add() {
        Attributes attributes = new Attributes();
        assertEquals(1, attributes.add("key", "value").size());
    }

    @Test
    public void put() {
        Attributes attributes = new Attributes();
        assertEquals(1, attributes.put("key", "value").size());
    }

    @Test
    public void putUserData() {
        Attributes attributes = new Attributes();
        Object value = mock(Object.class);
        when(attributes.putUserData("test", value)).thenReturn(attributes);
        assertEquals(value, attributes.putUserData("test"));
    }

    @Test
    public void remove() {
        Attributes attributes = new Attributes();
        assertEquals(1, attributes.remove("key").size());
    }

    @Test
    public void hasKey() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKey("test"));
    }

    @Test
    public void hasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasDeclaredValueForKey("test"));
    }

    @Test
    public void size() {
        Attributes attributes = new Attributes();
        assertEquals(1, attributes.size());
    }

    @Test
    public void isEmpty() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void asList() {
        Attributes attributes = new Attributes();
        List<Attribute> list = attributes.asList();
        assertNotNull(list);
    }

    @Test
    public void dataset() {
        Attributes attributes = new Attributes();
        Map<String, String> map = attributes.dataset();
        assertNotNull(map);
    }

    @Test
    public void html() {
        Attributes attributes = new Attributes();
        assertEquals("test", attributes.html());
    }

    @Test
    public void clone() {
        Attributes original = new Attributes();
        Attributes copy = original.clone();
        assertNotNull(copy);
        assertEquals(original, copy);
    }

    @Test
    public void normalize() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        // assertion omitted for brevity
    }

    @Test
    public void deduplicate() {
        Attributes attributes = new Attributes();
        int result = attributes.deduplicate(new ParseSettings());
        assertNotNull(result);
        // assertion omitted for brevity
    }
}

class Attribute {
    private String key;
    private String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}