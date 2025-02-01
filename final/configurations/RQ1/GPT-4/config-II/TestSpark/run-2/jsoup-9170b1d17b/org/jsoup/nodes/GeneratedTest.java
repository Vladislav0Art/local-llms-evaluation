package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        String value = attributes.get("key1");

        assertEquals("value1", value);
    }

    @Test
    public void putValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        int addedKeyIndex = attributes.indexOfKey("key1");
        String addedValue = (String) attributes.vals[addedKeyIndex];

        assertEquals("value1", addedValue);
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key1", "value1");

        String value = attributes.getIgnoreCase("key1");

        assertEquals("value1", value);
    }

    @Test
    public void addValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");

        int addedKeyIndex = attributes.indexOfKey("key1");
        String addedValue = (String) attributes.vals[addedKeyIndex];

        assertEquals("value1", addedValue);
    }

    @Test
    public void removeKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.remove("key1");

        assertTrue(attributes.size() == 0);
    }

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");

        assertTrue(attributes.hasKey("key1"));
    }

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");

        assertTrue(attributes.hasKeyIgnoreCase("KEY1"));
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.put("key2", "value2");

        attributes1.addAll(attributes2);

        assertTrue(attributes1.hasKey("key1"));
        assertTrue(attributes1.hasKey("key2"));
    }

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        String html = attributes.html();

        assertEquals("key=\"value\"", html);
    }

    @Test
    public void htmlWhenExceptionOccursTest() {
        Attributes spyAttributes = Mockito.spy(new Attributes());
        spyAttributes.put("key", "value");

        doThrow(new RuntimeException()).when(spyAttributes).html(any(), any());

        spyAttributes.html();
    }

    @Test
    public void equalsWithDifferentSizeTest() throws Exception {
        Attributes attr1 = new Attributes();
        attr1.put("key1", "value1");

        Attributes attr2 = new Attributes();
        attr2.put("key2", "value2");
        attr2.put("key3", "value3");

        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void equalsWithNonExistingKeyTest() {
        Attributes attr1 = new Attributes();
        attr1.put("key1", "value1");

        Attributes attr2 = new Attributes();
        attr2.put("key2", "value1");

        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void equalsWithDifferentValTest() {
        Attributes attr1 = new Attributes();
        attr1.put("key", "value1");

        Attributes attr2 = new Attributes();
        attr2.put("key", "value2");

        assertFalse(attr1.equals(attr2));
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
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");

        int hashCode = attributes.hashCode();

        assertTrue(hashCode != 0);
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");

        Attributes clonedAttributes = attributes.clone();

        assertTrue(attributes.equals(clonedAttributes));
        assertFalse(attributes == clonedAttributes);
    }

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key1", "value1");
        attributes.put("KEY2", "value2");

        attributes.normalize();

        assertTrue(attributes.hasKey("key1"));
        assertTrue(attributes.hasKey("key2"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value1");
        attributes.put("key", "value2");

        attributes.deduplicate(new ParseSettings(true, true));

        assertTrue(attributes.size() == 1);
    }

}