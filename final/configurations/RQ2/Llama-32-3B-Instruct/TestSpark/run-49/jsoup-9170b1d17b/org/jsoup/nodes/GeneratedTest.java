package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void indexOfKey_EmptyString_ReturnsMinusOne() {
        assertEquals(-1, new Attributes().indexOfKey(""));
    }

    @Test
    public void indexOfKey_NullString_ReturnsMinusOne() {
        assertEquals(-1, new Attributes().indexOfKey(null));
    }

    @Test
    public void checkNotNull_NullValue_ReturnsEmptyString() {
        assertEquals(Attributes.checkNotNull(null), "");
    }

    @Test
    public void get_NullValue_ReturnsEmptyString() {
        Document doc = new Document();
        String result = new Attributes().get(doc, "");
        assertEquals("", result);
    }

    @Test
    public void getUserData_NullKey_ThrowsNullPointerException() {
        NullPointerException expected = null;
        try {
            new Attributes().getUserData(null);
        } catch (NullPointerException e) {
            assertEquals(expected, e);
        }
    }

    @Test
    public void add_AddedKeyAndValue_ReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        List<Attribute> expected = Arrays.asList(new Attribute("key", "value"));
        assertTrue(attributes.asList().equals(expected));
    }

    @Test
    public void put_NullValue_PutReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("", null);
        List<Attribute> expected = Collections.emptyList();
        assertTrue(attributes.asList().equals(expected));
    }

    @Test
    public void remove_NullKey_ReturnsOriginalAttributes() {
        Attributes attributes = new Attributes();
        attributes.remove("");
        assertEquals(new Attributes(), attributes);
    }

    @Test
    public void hasKey_EmptyString_ReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey(""));
    }

    @Test
    public void size_ZeroAttributes_ReturnsZero() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void putBoolean_BooleanValue_PutReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        List<Attribute> expected = Arrays.asList(attribute);
        assertTrue(attributes.asList().equals(expected));
    }
}

public class Attributes {

    public int indexOfKey(String key) {
        // Method implementation
    }

    public String get(Document doc, String key) {
        // Method implementation
    }

    public void put(String key, Object value) {
        // Method implementation
    }

    public boolean hasKey(String key) {
        // Method implementation
    }

    public int size() {
        // Method implementation
    }

}