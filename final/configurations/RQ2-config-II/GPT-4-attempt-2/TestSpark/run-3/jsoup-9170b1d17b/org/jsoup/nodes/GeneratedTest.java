package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.jsoup.nodes.Attributes.*;

public class GeneratedTest {

    @Test
    public void getValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getInvalidKeyTest() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get("invalidKey"));
    }

    @Test
    public void getSizeOfEmptyAttributesTest() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void getSizeOfNotEmptyAttributesTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void checkUserObjectCanInsertAndFetchTest() {
        Attributes attributes = new Attributes();
        String userDataKey = "userKey";
        Object valueToInsert = new Integer(1);
        attributes.putUserData(userDataKey, valueToInsert);
        assertEquals(valueToInsert, attributes.getUserData(userDataKey));
    }

    @Test
    public void isEmptyTrueTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertFalse(attributes.isEmpty());
    }

    @Test
    public void hasKeyTrueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyFalseTest() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");

        Attributes attributesToAdd = new Attributes();
        attributesToAdd.put("key2", "value2");

        attributes.addAll(attributesToAdd);
        assertEquals(2, attributes.size());
        assertTrue(attributes.hasKey("key1"));
        assertTrue(attributes.hasKey("key2"));
    }

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        List<Attribute> list = attributes.asList();
        assertEquals(1, list.size());
    }

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-test", "value");
        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
        assertTrue(dataset.containsKey("test"));
    }

    @Test
    public void htmlTest() throws IOException {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String html = attributes.html();
        assertEquals("key=\"value\"", html);
    }

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes cloned = attributes.clone();
        assertEquals(attributes, cloned);
        assertNotSame(attributes, cloned);
    }

    @Test
    public void equalsTrueTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");
        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");
        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void equalsFalseTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");
        Attributes attributes2 = new Attributes();
        assertFalse(attributes1.equals(attributes2));
    }

    @Test
    public void checkNotNullNotNullObjectTest() {
        String notNullValue = "value";
        String result = checkNotNull(notNullValue);
        assertEquals(notNullValue, result);
    }

    @Test
    public void checkNotNullNullObjectTest() {
        Object nullValue = null;
        String result = checkNotNull(nullValue);
        assertEquals("", result);
    }

}