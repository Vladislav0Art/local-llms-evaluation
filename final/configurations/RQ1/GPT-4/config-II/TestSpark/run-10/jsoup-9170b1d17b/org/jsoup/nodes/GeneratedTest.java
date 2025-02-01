package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void GetNonExistingKey() {
        Attributes attributes = new Attributes();
        String value = attributes.get("key");
        assertEquals("", value);
    }

    @Test
    public void GetExistingKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String value = attributes.get("key");
        assertEquals("value", value);
    }

    @Test
    public void PutKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.get("key");
        assertEquals("value", value);
    }

    @Test
    public void PutUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        Object value = attributes.getUserData("key");
        assertEquals("value", value);
    }

    @Test
    public void HasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        boolean hasValue = attributes.hasDeclaredValueForKey("key");
        assertFalse(hasValue);

        attributes.put("key", "value");
        hasValue = attributes.hasDeclaredValueForKey("key");
        assertTrue(hasValue);
    }

    @Test
    public void SizeTest() {
        Attributes attributes = new Attributes();

        int size = attributes.size();
        assertEquals(0, size);

        attributes.put("key", "value");
        size = attributes.size();
        assertEquals(1, size);
    }

    @Test
    public void ContainsKeyTest() {
        Attributes attributes = new Attributes();
        boolean hasKey = attributes.hasKey("key");
        assertFalse(hasKey);

        attributes.put("key", "value");
        hasKey = attributes.hasKey("key");
        assertTrue(hasKey);
    }

    @Test
    public void RemoveAttributeTest() {
        Attributes attributes = new Attributes();

        attributes.put("key", "value");
        boolean hasKey = attributes.hasKey("key");
        assertTrue(hasKey);

        attributes.remove("key");
        hasKey = attributes.hasKey("key");
        assertFalse(hasKey);
    }

    @Test
    public void AsListTest() {
        Attributes attributes = new Attributes();
        List<Attribute> attrList = attributes.asList();
        assertEquals(0, attrList.size());

        attributes.put("key", "value");
        attrList = attributes.asList();
        assertEquals(1, attrList.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());

        attributes.put("key", "value");
        assertFalse(attributes.isEmpty());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");

        Attributes cloned = attrs.clone();
        assertEquals(attrs, cloned);
        assertNotSame(attrs, cloned);
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        attributes.normalize();
        assertFalse(attributes.hasKey("KEY"));
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key", "value2");
        ParseSettings parseSettings = new ParseSettings(false, true);
        int removed = attributes.deduplicate(parseSettings);
        assertEquals(1, removed);
    }

}